.class public final Lvz2;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Lg34;
.implements Lw85;


# instance fields
.field public q0:Lo88;

.field public r0:I

.field public s0:I

.field public t0:Z

.field public u0:I

.field public v0:I

.field public w0:Lo88;

.field public x0:Lrj8;


# virtual methods
.method public final J0(Lug3;Ltr4;I)I
    .locals 1

    .line 1
    check-cast p1, Lvi4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lvz2;->Z0(Lvi4;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lvz2;->u0:I

    .line 7
    .line 8
    iget v0, p0, Lvz2;->v0:I

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {p2, p3}, Ltr4;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget p2, p0, Lvz2;->u0:I

    .line 18
    .line 19
    iget p0, p0, Lvz2;->v0:I

    .line 20
    .line 21
    if-ge p1, p2, :cond_1

    .line 22
    .line 23
    move p1, p2

    .line 24
    :cond_1
    if-le p1, p0, :cond_2

    .line 25
    .line 26
    return p0

    .line 27
    :cond_2
    return p1
.end method

.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lvz2;->t0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ly01;->k:Lox1;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lfi2;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, Lvz2;->Y0(Lzr4;Lo88;Lfi2;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lvz2;->u0:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p3, p4}, Lq31;->i(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {p3, p4}, Lq31;->g(J)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v0, v2, v3}, Lx97;->n(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    move v6, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p3, p4}, Lq31;->i(J)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    iget p0, p0, Lvz2;->v0:I

    .line 48
    .line 49
    if-eq p0, v1, :cond_2

    .line 50
    .line 51
    invoke-static {p3, p4}, Lq31;->i(J)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p3, p4}, Lq31;->g(J)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {p0, v0, v1}, Lx97;->n(III)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    :goto_2
    move v7, p0

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    invoke-static {p3, p4}, Lq31;->g(J)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    goto :goto_2

    .line 70
    :goto_3
    const/4 v5, 0x0

    .line 71
    const/4 v8, 0x3

    .line 72
    const/4 v4, 0x0

    .line 73
    move-wide v2, p3

    .line 74
    invoke-static/range {v2 .. v8}, Lq31;->a(JIIIII)J

    .line 75
    .line 76
    .line 77
    move-result-wide p3

    .line 78
    invoke-interface {p2, p3, p4}, Ltr4;->o(J)Leo5;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p2, p0, Leo5;->X:I

    .line 83
    .line 84
    iget p3, p0, Leo5;->Y:I

    .line 85
    .line 86
    new-instance p4, Ld1;

    .line 87
    .line 88
    const/4 v0, 0x6

    .line 89
    invoke-direct {p4, p0, v0}, Ld1;-><init>(Leo5;B)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Le02;->X:Le02;

    .line 93
    .line 94
    invoke-interface {p1, p2, p3, p0, p4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 6

    .line 1
    sget-object v0, Ly01;->k:Lox1;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfi2;

    .line 8
    .line 9
    iget-object v1, p0, Lvz2;->q0:Lo88;

    .line 10
    .line 11
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lvz2;->w0:Lo88;

    .line 22
    .line 23
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lo88;->a:Lqe7;

    .line 28
    .line 29
    iget-object v1, v1, Lqe7;->f:Lgi2;

    .line 30
    .line 31
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v2, v2, Lo88;->a:Lqe7;

    .line 36
    .line 37
    iget-object v2, v2, Lqe7;->c:Ldj2;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    sget-object v2, Ldj2;->g0:Ldj2;

    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v3, v3, Lo88;->a:Lqe7;

    .line 48
    .line 49
    iget-object v3, v3, Lqe7;->d:Lbj2;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    iget v3, v3, Lbj2;->a:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v3, v4

    .line 58
    :goto_0
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v5, v5, Lo88;->a:Lqe7;

    .line 63
    .line 64
    iget-object v5, v5, Lqe7;->e:Lcj2;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    iget v5, v5, Lcj2;->a:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const v5, 0xffff

    .line 72
    .line 73
    .line 74
    :goto_1
    check-cast v0, Lhi2;

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2, v3, v5}, Lhi2;->b(Lgi2;Ldj2;II)Lrj8;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lvz2;->x0:Lrj8;

    .line 81
    .line 82
    new-instance v0, Luz2;

    .line 83
    .line 84
    invoke-direct {v0, p0, v4}, Luz2;-><init>(Lvz2;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, Lch3;->N(Ljx4;Ldn2;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 92
    .line 93
    return-void
.end method

.method public final R0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lvz2;->w0:Lo88;

    .line 3
    .line 4
    iput-object v0, p0, Lvz2;->x0:Lrj8;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 8
    .line 9
    return-void
.end method

.method public final V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvz2;->q0:Lo88;

    .line 2
    .line 3
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lvz2;->w0:Lo88;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 17
    .line 18
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Y0(Lzr4;Lo88;Lfi2;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p2, p1, p3, v0, v1}, Lc58;->a(Lo88;Lfi1;Lfi2;IZ)Lff;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Lff;->d:Lv78;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-virtual {p1, p2}, Lv78;->g(I)F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1, v1}, Lv78;->g(I)F

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {p1, v0}, Lv78;->g(I)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v0, p0, Lvz2;->r0:I

    .line 24
    .line 25
    invoke-static {p2, p3, p1, v0, v1}, Lvr3;->o(FFFII)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lvz2;->u0:I

    .line 30
    .line 31
    iget v0, p0, Lvz2;->s0:I

    .line 32
    .line 33
    const v1, 0x7fffffff

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p3, p1, v0, v1}, Lvr3;->o(FFFII)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lvz2;->v0:I

    .line 41
    .line 42
    return-void
.end method

.method public final Z0(Lvi4;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lvz2;->t0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lvz2;->a1()Lo88;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, Ly01;->k:Lox1;

    .line 11
    .line 12
    invoke-static {p0, v2}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lfi2;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0, v2}, Lvz2;->Y0(Lzr4;Lo88;Lfi2;)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, p0, Lvz2;->t0:Z

    .line 22
    .line 23
    :cond_0
    iget p1, p0, Lvz2;->u0:I

    .line 24
    .line 25
    if-gez p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v1, p1

    .line 29
    :goto_0
    iput v1, p0, Lvz2;->u0:I

    .line 30
    .line 31
    iget p1, p0, Lvz2;->v0:I

    .line 32
    .line 33
    const/4 v0, -0x1

    .line 34
    if-eq p1, v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const p1, 0x7fffffff

    .line 38
    .line 39
    .line 40
    :goto_1
    iput p1, p0, Lvz2;->v0:I

    .line 41
    .line 42
    return-void
.end method

.method public final a1()Lo88;
    .locals 0

    .line 1
    iget-object p0, p0, Lvz2;->w0:Lo88;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Resolved style is not set."

    .line 7
    .line 8
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 3
    .line 4
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvz2;->x0:Lrj8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Luz2;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Luz2;-><init>(Lvz2;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lch3;->N(Ljx4;Ldn2;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lvz2;->t0:Z

    .line 16
    .line 17
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final y0(Lug3;Ltr4;I)I
    .locals 1

    .line 1
    check-cast p1, Lvi4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lvz2;->Z0(Lvi4;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lvz2;->u0:I

    .line 7
    .line 8
    iget v0, p0, Lvz2;->v0:I

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    return p1

    .line 13
    :cond_0
    invoke-interface {p2, p3}, Ltr4;->K(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget p2, p0, Lvz2;->u0:I

    .line 18
    .line 19
    iget p0, p0, Lvz2;->v0:I

    .line 20
    .line 21
    if-ge p1, p2, :cond_1

    .line 22
    .line 23
    move p1, p2

    .line 24
    :cond_1
    if-le p1, p0, :cond_2

    .line 25
    .line 26
    return p0

    .line 27
    :cond_2
    return p1
.end method
