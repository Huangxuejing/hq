package com.taidii.staffdevelopment.enums;

/**
 * @description:自评状态枚举
 * @projectName:staff-development
 * @className:SelfEvaluationStatusEnum.java
 * @author:wentao
 * @createTime:2018年6月13日 上午9:50:29
 * @version 1.0.1
 */
public enum SelfEvaluationStatusEnum {

    DRAFT(2, "Draft"),			//草稿状态
    SUBMIT(3, "Submit"),		//提交状态
    REVIEWED(4, "Reviewed"),//结束状态
    OVERDUE_DRAFT(5, "OverdueDraft"),//过期草稿状态
    OVERDUE_SUBMIT(6, "OverdueSubmit"),//过期提交状态
    ;

    final private int id;
    final private String name;

    SelfEvaluationStatusEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    /**
	 *
	 * @description:通过枚举值获取枚举另一个值
	 * @param value
	 * @return
	 * @author:衷文涛
	 * @createTime:2018年3月26日 下午3:11:13
	 */
	public static String getValueById(int id)
	{
		SelfEvaluationStatusEnum[] enumArray = SelfEvaluationStatusEnum.values();

		for (SelfEvaluationStatusEnum enums : enumArray)
		{
			if (id == enums.getId())
			{
				return enums.getName();
			}
		}

		return null;
	}
}
