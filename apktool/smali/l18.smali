.class public final Ll18;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public Z:Z

.field public synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Lb71;

.field public final synthetic h0:Ldt5;

.field public final synthetic i0:Lsn2;

.field public final synthetic j0:Lgn2;


# direct methods
.method public constructor <init>(Lb71;Ldt5;Lsn2;Lgn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll18;->g0:Lb71;

    .line 2
    .line 3
    iput-object p2, p0, Ll18;->h0:Ldt5;

    .line 4
    .line 5
    iput-object p3, p0, Ll18;->i0:Lsn2;

    .line 6
    .line 7
    iput-object p4, p0, Ll18;->j0:Lgn2;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lqj6;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbz7;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ll18;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ll18;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ll18;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Ll18;

    .line 2
    .line 3
    iget-object v3, p0, Ll18;->i0:Lsn2;

    .line 4
    .line 5
    iget-object v4, p0, Ll18;->j0:Lgn2;

    .line 6
    .line 7
    iget-object v1, p0, Ll18;->g0:Lb71;

    .line 8
    .line 9
    iget-object v2, p0, Ll18;->h0:Ldt5;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Ll18;-><init>(Lb71;Ldt5;Lsn2;Lgn2;Lq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Ll18;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Ll18;->Z:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Ll18;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Lbz7;

    .line 26
    .line 27
    iput-boolean v1, p0, Ll18;->Z:Z

    .line 28
    .line 29
    iget-object v3, p0, Ll18;->g0:Lb71;

    .line 30
    .line 31
    iget-object v4, p0, Ll18;->h0:Ldt5;

    .line 32
    .line 33
    iget-object v5, p0, Ll18;->i0:Lsn2;

    .line 34
    .line 35
    iget-object v6, p0, Ll18;->j0:Lgn2;

    .line 36
    .line 37
    move-object v7, p0

    .line 38
    invoke-static/range {v2 .. v7}, Lq18;->g(Lbz7;Lb71;Ldt5;Lsn2;Lgn2;Lr10;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object p1, Lc71;->X:Lc71;

    .line 43
    .line 44
    if-ne p0, p1, :cond_2

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_2
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 48
    .line 49
    return-object p0
.end method
