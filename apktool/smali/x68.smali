.class public final Lx68;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Lg34;


# instance fields
.field public final q0:Lo88;

.field public r0:Lrj8;

.field public s0:Lv68;


# direct methods
.method public constructor <init>(Lo88;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx68;->q0:Lo88;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 10

    .line 1
    iget-object v0, p0, Lx68;->s0:Lv68;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lv68;->f:Lrh5;

    .line 6
    .line 7
    iget-object p0, p0, Lx68;->r0:Lrj8;

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    iget-object p0, p0, Lrj8;->X:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v2, v0, Lv68;->e:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-object p0, v0, Lv68;->e:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const-wide v2, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/16 v4, 0x20

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object p0, v0, Lv68;->c:Lfi2;

    .line 49
    .line 50
    iget-object v6, v0, Lv68;->d:Lo88;

    .line 51
    .line 52
    iget-object v7, v0, Lv68;->b:Lfi1;

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    invoke-static {v6, v7, p0, v8, v5}, Lc58;->a(Lo88;Lfi1;Lfi2;IZ)Lff;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object v6, p0, Lff;->a:Lkf;

    .line 60
    .line 61
    invoke-virtual {v6}, Lkf;->h()F

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-static {v6}, Lz38;->a(F)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget p0, p0, Lff;->f:F

    .line 70
    .line 71
    invoke-static {p0}, Lz38;->a(F)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    int-to-long v6, v6

    .line 76
    shl-long/2addr v6, v4

    .line 77
    int-to-long v8, p0

    .line 78
    and-long/2addr v8, v2

    .line 79
    or-long/2addr v6, v8

    .line 80
    iput-wide v6, v0, Lv68;->g:J

    .line 81
    .line 82
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v1, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-wide v0, v0, Lv68;->g:J

    .line 88
    .line 89
    shr-long v6, v0, v4

    .line 90
    .line 91
    long-to-int p0, v6

    .line 92
    and-long/2addr v0, v2

    .line 93
    long-to-int v0, v0

    .line 94
    const/16 v1, 0xa

    .line 95
    .line 96
    invoke-static {p0, v5, v0, v5, v1}, Ls31;->b(IIIII)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    invoke-static {p3, p4, v0, v1}, Ls31;->e(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide p3

    .line 104
    invoke-interface {p2, p3, p4}, Ltr4;->o(J)Leo5;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    iget p2, p0, Leo5;->X:I

    .line 109
    .line 110
    iget p3, p0, Leo5;->Y:I

    .line 111
    .line 112
    new-instance p4, Ld1;

    .line 113
    .line 114
    const/16 v0, 0xf

    .line 115
    .line 116
    invoke-direct {p4, p0, v0}, Ld1;-><init>(Leo5;B)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Le02;->X:Le02;

    .line 120
    .line 121
    invoke-interface {p1, p2, p3, p0, p4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_2
    const-string p0, "Font resolution state is not set."

    .line 127
    .line 128
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    throw p0

    .line 133
    :cond_3
    const-string p0, "Min size state is not set."

    .line 134
    .line 135
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    throw p0
.end method

.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 8

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 6
    .line 7
    iget-object v1, p0, Lx68;->q0:Lo88;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sget-object v0, Ly01;->k:Lox1;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lfi2;

    .line 21
    .line 22
    invoke-virtual {p0, v6, v5}, Lx68;->Y0(Lo88;Lfi2;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lv68;

    .line 26
    .line 27
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v3, v0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 32
    .line 33
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v4, v0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 38
    .line 39
    iget-object v0, p0, Lx68;->r0:Lrj8;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v7, v0, Lrj8;->X:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct/range {v2 .. v7}, Lv68;-><init>(Lz24;Lfi1;Lfi2;Lo88;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lx68;->s0:Lv68;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "Font resolution state is not set."

    .line 52
    .line 53
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    throw p0
.end method

.method public final R0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lx68;->r0:Lrj8;

    .line 3
    .line 4
    iput-object v0, p0, Lx68;->s0:Lv68;

    .line 5
    .line 6
    return-void
.end method

.method public final V()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx68;->s0:Lv68;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 10
    .line 11
    const/16 v2, 0x1e

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v1, v3, v3, v2}, Lv68;->a(Lv68;Lz24;Lfi1;Lo88;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Y0(Lo88;Lfi2;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lo88;->a:Lqe7;

    .line 2
    .line 3
    iget-object v0, p1, Lqe7;->f:Lgi2;

    .line 4
    .line 5
    iget-object v1, p1, Lqe7;->c:Ldj2;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Ldj2;->g0:Ldj2;

    .line 10
    .line 11
    :cond_0
    iget-object v2, p1, Lqe7;->d:Lbj2;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget v2, v2, Lbj2;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    :goto_0
    iget-object p1, p1, Lqe7;->e:Lcj2;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget p1, p1, Lcj2;->a:I

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const p1, 0xffff

    .line 27
    .line 28
    .line 29
    :goto_1
    check-cast p2, Lhi2;

    .line 30
    .line 31
    invoke-virtual {p2, v0, v1, v2, p1}, Lhi2;->b(Lgi2;Ldj2;II)Lrj8;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lx68;->r0:Lrj8;

    .line 36
    .line 37
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx68;->s0:Lv68;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 10
    .line 11
    const/16 v2, 0x1d

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v3, v1, v3, v2}, Lv68;->a(Lv68;Lz24;Lfi1;Lo88;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
