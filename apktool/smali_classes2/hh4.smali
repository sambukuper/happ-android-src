.class public final Lhh4;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lsu/happ/proxyutility/log_report/LogWorker;

.field public i0:I


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/log_report/LogWorker;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhh4;->h0:Lsu/happ/proxyutility/log_report/LogWorker;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lhh4;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lhh4;->i0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lhh4;->i0:I

    .line 9
    .line 10
    iget-object p1, p0, Lhh4;->h0:Lsu/happ/proxyutility/log_report/LogWorker;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lsu/happ/proxyutility/log_report/LogWorker;->e(Lq51;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
