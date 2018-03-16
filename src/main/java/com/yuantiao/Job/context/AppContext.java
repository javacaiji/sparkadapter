package com.yuantiao.Job.context;

public class AppContext {
    private DAGContext dagContext;
    private StatisticContext statisticContext;

    public com.yuantiao.Job.context.DAGContext getDagContext() {
        return dagContext;
    }

    public void setDagContext(com.yuantiao.Job.context.DAGContext dagContext) {
        this.dagContext = dagContext;
    }

    public com.yuantiao.Job.context.StatisticContext getStatisticContext() {
        return statisticContext;
    }

    public void setStatisticContext(com.yuantiao.Job.context.StatisticContext statisticContext) {
        this.statisticContext = statisticContext;
    }
}
