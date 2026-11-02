.class public final Lc00;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public q0:Lt98;

.field public final synthetic r0:Ld00;


# direct methods
.method public constructor <init>(Ld00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc00;->r0:Ld00;

    .line 2
    .line 3
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final Q0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lc00;->r0:Ld00;

    .line 2
    .line 3
    iput-object p0, v0, Ld00;->X:Lc00;

    .line 4
    .line 5
    iget-object v1, v0, Ld00;->Y:Lux0;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    new-instance v1, Lp0;

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v1, p0, v0, v2}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v2, v0, Landroidx/compose/ui/node/LayoutNode;->Y:I

    .line 20
    .line 21
    invoke-static {v0}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lmf5;->getRectManager()Lu86;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v3, v0, Lu86;->d:Lu98;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v4, v3, Lu98;->a:Lvz4;

    .line 35
    .line 36
    new-instance v5, Lt98;

    .line 37
    .line 38
    invoke-direct {v5, v3, v2, p0, v1}, Lt98;-><init>(Lu98;ILc00;Lp0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v2}, Lff3;->b(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v4, v2, v5}, Lvz4;->h(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v1, v5

    .line 51
    :cond_0
    check-cast v1, Lt98;

    .line 52
    .line 53
    if-eq v1, v5, :cond_2

    .line 54
    .line 55
    :goto_0
    iget-object v2, v1, Lt98;->d:Lt98;

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    move-object v1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iput-object v5, v1, Lt98;->d:Lt98;

    .line 62
    .line 63
    :cond_2
    iget-object v1, p0, Ljx4;->X:Ljx4;

    .line 64
    .line 65
    invoke-static {v1}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget v2, v1, Landroidx/compose/ui/node/LayoutNode;->i0:I

    .line 70
    .line 71
    const/4 v3, -0x4

    .line 72
    if-eq v2, v3, :cond_3

    .line 73
    .line 74
    iget-object v2, v0, Lu86;->c:Lne;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lu86;->d(Landroidx/compose/ui/node/LayoutNode;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget-object v2, v2, Lne;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, [J

    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x2

    .line 85
    .line 86
    aget-wide v3, v2, v1

    .line 87
    .line 88
    const-wide v6, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    and-long/2addr v3, v6

    .line 94
    const-wide/high16 v6, -0x7000000000000000L

    .line 95
    .line 96
    or-long/2addr v3, v6

    .line 97
    aput-wide v3, v2, v1

    .line 98
    .line 99
    :cond_3
    const/4 v1, 0x1

    .line 100
    iput-boolean v1, v0, Lu86;->f:Z

    .line 101
    .line 102
    invoke-virtual {v0}, Lu86;->j()V

    .line 103
    .line 104
    .line 105
    iput-object v5, p0, Lc00;->q0:Lt98;

    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public final R0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc00;->r0:Ld00;

    .line 2
    .line 3
    iget-object v1, v0, Ld00;->X:Lc00;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, Ld00;->X:Lc00;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lc00;->q0:Lt98;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lt98;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, Lc00;->q0:Lt98;

    .line 18
    .line 19
    return-void
.end method
