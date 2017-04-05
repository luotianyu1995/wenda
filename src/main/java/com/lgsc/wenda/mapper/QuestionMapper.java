package com.lgsc.wenda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lgsc.wenda.model.Question;

public interface QuestionMapper {
	
	public static String TABLE_NAME=" question ";
	// insert_fieldes
	public static String INSERT_FIELDES=" title,content,create_date,user_id,comment_count";
	
	public static String SELECT_FIELDES=" id, "+INSERT_FIELDES;
	
	@Insert({"insert into",TABLE_NAME,"(",INSERT_FIELDES,")",	
	"values (#{title},#{content},#{createDate},#{userId},#{commentCount})"})
	public int addQuestion(Question question);
	
	@Update({"update ",TABLE_NAME,"set title=#{title},content=#{content},create_date=#{createDate},userId={#userId},comment_count={#commentCount}"
		,"where id=#{questionId}"})
	public int updateQuestionById(Question question);
	
	@Delete({"delete from ",TABLE_NAME,"where id=#{questionId}"})
	
	public void deleteById(Integer questionId);
	
	@Select({"select * from ",TABLE_NAME,"where id=#{questionId}"})
	@Results({@Result(column="id",property="questionId"),@Result(column="user_id",property="userId"),@Result(column="create_date",property="createDate")
	,@Result(column="comment_count",property="commentCount")})
	public Question selectQuestionById(Integer questionId);
	
	public List<Question>getAllQuestion(@Param("userId")Integer userId);
}
