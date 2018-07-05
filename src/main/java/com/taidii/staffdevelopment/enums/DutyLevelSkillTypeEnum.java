package com.taidii.staffdevelopment.enums;

/**
 * @description:职业能力类型
 * @projectName:staff-development
 * @className:DutyLevelSkillTypeEnum.java
 * @author:wentao
 * @createTime:2018年6月13日 下午2:19:30
 * @version 1.0.1
 */
public enum DutyLevelSkillTypeEnum {

	BASIC(1, "Basic"),//基础能力
	CUSTOM(2, "Custom"),//额外能力
    ;

    final private int id;
    final private String name;

    DutyLevelSkillTypeEnum(int id, String name) {
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
