// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsReturnorderAddResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.wms:
//            ProcessResult

public class LogisticsReturnorderAddResponse extends AbstractResponse {

    public LogisticsReturnorderAddResponse() {
    }

    public void setProcessResult(ProcessResult processResult) {
        this.processResult = processResult;
    }

    public ProcessResult getProcessResult() {
        return processResult;
    }

    private ProcessResult processResult;
}
