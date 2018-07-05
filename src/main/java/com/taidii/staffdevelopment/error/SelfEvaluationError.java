package com.taidii.staffdevelopment.error;

public enum SelfEvaluationError implements ICommonError{

	SELF_EVALUATION_NOT_FOUND(20001, "Staff appraisal not found"),
	SELF_EVALUATION_AUBMITTED(20002,"Staff appraisal has been submitted"),
	SELF_EVALUATION_NOT_IN_DRAFT(20006,"Staff appraisal not in the draft"),
	SELF_EVALUATION_NOT_IN_SUBMIT(20007,"Staff appraisal not in the submit"),
	
	SELF_EVALUATION_SKILL_NOT_FOUND(20003,"Staff appraisal skill not found"),
	
	SELF_EVALUATION_REFLECTION_NOT_FOUND(20003,"Staff appraisal reflection not found"),
	SELF_EVALUATION_REFLECTION_DATA_ERROR(20004,"Staff appraisal reflection data error"),
	
	SELF_EVALUATION_PLAN_NOT_FOUND(20005,"Staff appraisal improvement plan not found"),
	;

	final private int id;
    final private String msg;

    SelfEvaluationError(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getMsg() {
		return msg;
	}

}
