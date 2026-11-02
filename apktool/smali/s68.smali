.class public final Ls68;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ldt5;

.field public final synthetic j0:Lr68;

.field public final synthetic k0:J

.field public final synthetic l0:Lxz4;


# direct methods
.method public constructor <init>(Ldt5;Lr68;JLxz4;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls68;->i0:Ldt5;

    .line 2
    .line 3
    iput-object p2, p0, Ls68;->j0:Lr68;

    .line 4
    .line 5
    iput-wide p3, p0, Ls68;->k0:J

    .line 6
    .line 7
    iput-object p5, p0, Ls68;->l0:Lxz4;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ls68;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ls68;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ls68;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 7

    .line 1
    new-instance v0, Ls68;

    .line 2
    .line 3
    iget-wide v3, p0, Ls68;->k0:J

    .line 4
    .line 5
    iget-object v5, p0, Ls68;->l0:Lxz4;

    .line 6
    .line 7
    iget-object v1, p0, Ls68;->i0:Ldt5;

    .line 8
    .line 9
    iget-object v2, p0, Ls68;->j0:Lr68;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Ls68;-><init>(Ldt5;Lr68;JLxz4;Lq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Ls68;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Ls68;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ls68;->j0:Lr68;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lc71;->X:Lc71;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v4, :cond_1

    .line 13
    .line 14
    if-ne v0, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Ls68;->h0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lb71;

    .line 36
    .line 37
    new-instance v6, Ls0;

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x3

    .line 41
    iget-object v7, p0, Ls68;->j0:Lr68;

    .line 42
    .line 43
    iget-wide v8, p0, Ls68;->k0:J

    .line 44
    .line 45
    iget-object v10, p0, Ls68;->l0:Lxz4;

    .line 46
    .line 47
    invoke-direct/range {v6 .. v12}, Ls0;-><init>(Ljava/lang/Object;JLxz4;Lq51;B)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-static {p1, v1, v1, v6, v0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 52
    .line 53
    .line 54
    iput-byte v4, p0, Ls68;->g0:B

    .line 55
    .line 56
    iget-object p1, p0, Ls68;->i0:Ldt5;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ldt5;->d(Ls51;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v5, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget-object v0, v2, Lr68;->w:Lft5;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    new-instance p1, Lgt5;

    .line 78
    .line 79
    invoke-direct {p1, v0}, Lgt5;-><init>(Lft5;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    new-instance p1, Let5;

    .line 84
    .line 85
    invoke-direct {p1, v0}, Let5;-><init>(Lft5;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    iput-byte v3, p0, Ls68;->g0:B

    .line 89
    .line 90
    iget-object v0, p0, Ls68;->l0:Lxz4;

    .line 91
    .line 92
    invoke-virtual {v0, p1, p0}, Lxz4;->a(Lvf3;Lq51;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v5, :cond_5

    .line 97
    .line 98
    :goto_2
    return-object v5

    .line 99
    :cond_5
    :goto_3
    iput-object v1, v2, Lr68;->w:Lft5;

    .line 100
    .line 101
    sget-object p0, Ldn8;->a:Ldn8;

    .line 102
    .line 103
    return-object p0
.end method
