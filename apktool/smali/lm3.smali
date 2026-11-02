.class public final Llm3;
.super Lgm3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Ltz6;

.field public final synthetic h0:Lrm3;


# direct methods
.method public constructor <init>(Lrm3;Ltz6;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llm3;->h0:Lrm3;

    .line 2
    .line 3
    invoke-direct {p0}, Lwe4;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Llm3;->g0:Ltz6;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Llm3;->h0:Lrm3;

    .line 2
    .line 3
    invoke-virtual {p1}, Lrm3;->M()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lxx0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0}, Lsm3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iget-object p0, p0, Llm3;->g0:Ltz6;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Ltz6;->i(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    return-void
.end method
