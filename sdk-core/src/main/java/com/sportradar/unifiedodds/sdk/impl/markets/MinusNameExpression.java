/*
 * Copyright (C) Sportradar AG. See LICENSE for full license governing this code
 */

package com.sportradar.unifiedodds.sdk.impl.markets;

import com.google.common.base.Preconditions;
import com.sportradar.utils.SdkHelper;
import java.util.Locale;

/**
 * Created on 22/06/2017.
 * // TODO @eti: Javadoc
 */
public class MinusNameExpression implements NameExpression {

    private final Operand operand;

    MinusNameExpression(Operand operand) {
        Preconditions.checkNotNull(operand);

        this.operand = operand;
    }

    @Override
    public String buildName(Locale locale) {
        double decimalValue = operand.getDecimalValue();
        return SdkHelper.doubleToStringWithSign(decimalValue * -1);
    }
}
