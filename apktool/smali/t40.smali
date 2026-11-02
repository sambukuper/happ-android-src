.class public final Lt40;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public Z:Lbq5;

.field public f0:Z

.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lb71;

.field public final synthetic i0:Ljc8;


# direct methods
.method public constructor <init>(Lb71;Ljc8;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt40;->h0:Lb71;

    .line 2
    .line 3
    iput-object p2, p0, Lt40;->i0:Ljc8;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lqj6;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Lt40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lt40;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lt40;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lc71;->X:Lc71;

    .line 17
    .line 18
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Lt40;

    .line 2
    .line 3
    iget-object v1, p0, Lt40;->h0:Lb71;

    .line 4
    .line 5
    iget-object p0, p0, Lt40;->i0:Ljc8;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lt40;-><init>(Lb71;Ljc8;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lt40;->g0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lt40;->f0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt40;->Z:Lbq5;

    .line 10
    .line 11
    iget-object v3, p0, Lt40;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lbz7;

    .line 14
    .line 15
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lt40;->g0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lbz7;

    .line 31
    .line 32
    sget-object v0, Lbq5;->Y:Lbq5;

    .line 33
    .line 34
    move-object v3, p1

    .line 35
    :cond_2
    :goto_0
    iput-object v3, p0, Lt40;->g0:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Lt40;->Z:Lbq5;

    .line 38
    .line 39
    iput-boolean v2, p0, Lt40;->f0:Z

    .line 40
    .line 41
    invoke-virtual {v3, v0, p0}, Lbz7;->a(Lbq5;Lr10;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v4, Lc71;->X:Lc71;

    .line 46
    .line 47
    if-ne p1, v4, :cond_3

    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_3
    :goto_1
    check-cast p1, Laq5;

    .line 51
    .line 52
    iget-object v4, p1, Laq5;->a:Ljava/util/List;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lhq5;

    .line 60
    .line 61
    iget v4, v4, Lhq5;->i:I

    .line 62
    .line 63
    const/4 v5, 0x2

    .line 64
    if-ne v4, v5, :cond_2

    .line 65
    .line 66
    iget p1, p1, Laq5;->f:I

    .line 67
    .line 68
    const/4 v4, 0x4

    .line 69
    iget-object v6, p0, Lt40;->i0:Ljc8;

    .line 70
    .line 71
    if-ne p1, v4, :cond_4

    .line 72
    .line 73
    new-instance p1, Lo40;

    .line 74
    .line 75
    invoke-direct {p1, v6, v1, v5}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 76
    .line 77
    .line 78
    const/4 v4, 0x3

    .line 79
    iget-object v5, p0, Lt40;->h0:Lb71;

    .line 80
    .line 81
    invoke-static {v5, v1, v1, p1, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/4 v4, 0x5

    .line 86
    if-ne p1, v4, :cond_2

    .line 87
    .line 88
    invoke-virtual {v6}, Ljc8;->a()V

    .line 89
    .line 90
    .line 91
    goto :goto_0
.end method
