package com.taidii.staffdevelopment.enums;

/**
 * @description:自评 时期 枚举
 * @projectName:staff-development
 * @className:SelfEvaluationPeriodEnum.java
 * @author:wentao
 * @createTime:2018年6月13日 上午9:27:47
 * @version 1.0.1
 */
public enum SelfEvaluationPeriodEnum {
	MID_YEAR(1, "Mid-Year"),	//年中
    ANNUAL(2, "Annual");			//年末

    final private int id;
    final private String name;

    SelfEvaluationPeriodEnum(int id, String name) {
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
		SelfEvaluationPeriodEnum[] enumArray = SelfEvaluationPeriodEnum.values();

		for (SelfEvaluationPeriodEnum selfEvaluationPeriodEnum : enumArray)
		{
			if (id == selfEvaluationPeriodEnum.getId())
			{
				return selfEvaluationPeriodEnum.getName();
			}
		}

		return null;
	}
}
