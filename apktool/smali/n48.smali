.class public final Ln48;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;
.implements Lrv1;
.implements Ls01;
.implements Las2;
.implements Lw07;


# instance fields
.field public A0:Lsd5;

.field public B0:Lub8;

.field public C0:Lip5;

.field public D0:Lo8;

.field public E0:Log7;

.field public F0:Lf88;

.field public G0:Ls86;

.field public H0:I

.field public I0:I

.field public final J0:Ly58;

.field public final K0:Lw38;

.field public s0:Z

.field public t0:Z

.field public u0:Ly78;

.field public v0:Lkd8;

.field public w0:Lr68;

.field public x0:Ld90;

.field public y0:Z

.field public z0:Lay6;


# direct methods
.method public constructor <init>(ZZZLy78;Lkd8;Lr68;Ld90;ZLay6;Lsd5;Lub8;Lip5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ln48;->s0:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Ln48;->t0:Z

    .line 7
    .line 8
    iput-object p4, p0, Ln48;->u0:Ly78;

    .line 9
    .line 10
    iput-object p5, p0, Ln48;->v0:Lkd8;

    .line 11
    .line 12
    iput-object p6, p0, Ln48;->w0:Lr68;

    .line 13
    .line 14
    iput-object p7, p0, Ln48;->x0:Ld90;

    .line 15
    .line 16
    iput-boolean p8, p0, Ln48;->y0:Z

    .line 17
    .line 18
    iput-object p9, p0, Ln48;->z0:Lay6;

    .line 19
    .line 20
    iput-object p10, p0, Ln48;->A0:Lsd5;

    .line 21
    .line 22
    iput-object p11, p0, Ln48;->B0:Lub8;

    .line 23
    .line 24
    iput-object p12, p0, Ln48;->C0:Lip5;

    .line 25
    .line 26
    new-instance p7, Ls86;

    .line 27
    .line 28
    const/high16 p8, -0x40800000    # -1.0f

    .line 29
    .line 30
    invoke-direct {p7, p8, p8, p8, p8}, Ls86;-><init>(FFFF)V

    .line 31
    .line 32
    .line 33
    iput-object p7, p0, Ln48;->G0:Ls86;

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 45
    :goto_1
    sget-object p2, Llj4;->a:Le17;

    .line 46
    .line 47
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 p3, 0x1c

    .line 50
    .line 51
    if-lt p2, p3, :cond_2

    .line 52
    .line 53
    new-instance p2, La68;

    .line 54
    .line 55
    invoke-direct {p2, p5, p6, p4, p1}, La68;-><init>(Lkd8;Lr68;Ly78;Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    new-instance p2, Lhh;

    .line 60
    .line 61
    invoke-direct {p2}, Loh1;-><init>()V

    .line 62
    .line 63
    .line 64
    :goto_2
    invoke-virtual {p0, p2}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Ln48;->J0:Ly58;

    .line 68
    .line 69
    new-instance p1, Lw38;

    .line 70
    .line 71
    iget-object p2, p0, Ln48;->B0:Lub8;

    .line 72
    .line 73
    new-instance p3, Ll48;

    .line 74
    .line 75
    const/4 p4, 0x0

    .line 76
    invoke-direct {p3, p0, p4}, Ll48;-><init>(Ln48;Lq51;)V

    .line 77
    .line 78
    .line 79
    new-instance p5, Lli;

    .line 80
    .line 81
    const/4 p6, 0x3

    .line 82
    invoke-direct {p5, p0, p4, p6}, Lli;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 83
    .line 84
    .line 85
    new-instance p4, Lpy7;

    .line 86
    .line 87
    const/4 p6, 0x5

    .line 88
    invoke-direct {p4, p0, p6}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, p2, p3, p5, p4}, Lw38;-><init>(Lub8;Ll48;Lli;Lpy7;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Ln48;->K0:Lw38;

    .line 98
    .line 99
    return-void
.end method

.method public static b1(Lsv1;Lx78;)V
    .locals 10

    .line 1
    invoke-interface {p0}, Lsv1;->n0()Llr;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Llr;->k()Lsm0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v2, p1, Lx78;->c:J

    .line 10
    .line 11
    const/16 p0, 0x20

    .line 12
    .line 13
    shr-long v4, v2, p0

    .line 14
    .line 15
    long-to-int v0, v4

    .line 16
    int-to-float v0, v0

    .line 17
    move v4, v0

    .line 18
    iget-object v0, p1, Lx78;->b:Lbz4;

    .line 19
    .line 20
    iget v5, v0, Lbz4;->d:F

    .line 21
    .line 22
    cmpg-float v4, v4, v5

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v6, 0x0

    .line 26
    if-gez v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lx78;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    :goto_0
    move v4, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v6

    .line 38
    :goto_1
    iget-object p1, p1, Lx78;->a:Lw78;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    iget v4, p1, Lw78;->f:I

    .line 43
    .line 44
    const/4 v7, 0x3

    .line 45
    if-ne v4, v7, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v7, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    :goto_2
    move v7, v6

    .line 51
    :goto_3
    if-eqz v7, :cond_4

    .line 52
    .line 53
    shr-long v4, v2, p0

    .line 54
    .line 55
    long-to-int v4, v4

    .line 56
    int-to-float v4, v4

    .line 57
    const-wide v5, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v2, v5

    .line 63
    long-to-int v2, v2

    .line 64
    int-to-float v2, v2

    .line 65
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    int-to-long v3, v3

    .line 70
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-long v8, v2

    .line 75
    shl-long v2, v3, p0

    .line 76
    .line 77
    and-long v4, v8, v5

    .line 78
    .line 79
    or-long/2addr v2, v4

    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    invoke-static {v4, v5, v2, v3}, Lu70;->n(JJ)Ls86;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {v1}, Lsm0;->g()V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, p0}, Lsm0;->q(Lsm0;Ls86;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    iget-object p0, p1, Lw78;->b:Lo88;

    .line 93
    .line 94
    iget-object p0, p0, Lo88;->a:Lqe7;

    .line 95
    .line 96
    iget-object p1, p0, Lqe7;->m:Lx38;

    .line 97
    .line 98
    iget-object v2, p0, Lqe7;->a:Lf78;

    .line 99
    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    sget-object p1, Lx38;->b:Lx38;

    .line 103
    .line 104
    :cond_5
    move-object v5, p1

    .line 105
    iget-object p1, p0, Lqe7;->n:Lt67;

    .line 106
    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    sget-object p1, Lt67;->d:Lt67;

    .line 110
    .line 111
    :cond_6
    move-object v4, p1

    .line 112
    iget-object p0, p0, Lqe7;->p:Ltv1;

    .line 113
    .line 114
    if-nez p0, :cond_7

    .line 115
    .line 116
    sget-object p0, Lea2;->a:Lea2;

    .line 117
    .line 118
    :cond_7
    move-object v6, p0

    .line 119
    move-object p0, v2

    .line 120
    :try_start_0
    invoke-interface {p0}, Lf78;->c()Ld90;

    .line 121
    .line 122
    .line 123
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    sget-object p1, Le78;->a:Le78;

    .line 125
    .line 126
    if-eqz v2, :cond_9

    .line 127
    .line 128
    if-eq p0, p1, :cond_8

    .line 129
    .line 130
    :try_start_1
    invoke-interface {p0}, Lf78;->a()F

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    :goto_4
    move v3, p0

    .line 135
    goto :goto_5

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    goto :goto_9

    .line 139
    :cond_8
    const/high16 p0, 0x3f800000    # 1.0f

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :goto_5
    invoke-static/range {v0 .. v6}, Lbz4;->i(Lbz4;Lsm0;Ld90;FLt67;Lx38;Ltv1;)V

    .line 143
    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_9
    if-eq p0, p1, :cond_a

    .line 147
    .line 148
    invoke-interface {p0}, Lf78;->b()J

    .line 149
    .line 150
    .line 151
    move-result-wide p0

    .line 152
    :goto_6
    move-wide v2, p0

    .line 153
    goto :goto_7

    .line 154
    :cond_a
    sget-wide p0, Ldw0;->b:J

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :goto_7
    invoke-static/range {v0 .. v6}, Lbz4;->h(Lbz4;Lsm0;JLt67;Lx38;Ltv1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    .line 159
    .line 160
    :goto_8
    if-eqz v7, :cond_b

    .line 161
    .line 162
    invoke-interface {v1}, Lsm0;->p()V

    .line 163
    .line 164
    .line 165
    :cond_b
    return-void

    .line 166
    :goto_9
    if-eqz v7, :cond_c

    .line 167
    .line 168
    invoke-interface {v1}, Lsm0;->p()V

    .line 169
    .line 170
    .line 171
    :cond_c
    throw p0
.end method


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-object v2, p0, Ln48;->A0:Lsd5;

    .line 4
    .line 5
    sget-object v3, Lsd5;->X:Lsd5;

    .line 6
    .line 7
    sget-object v6, Le02;->X:Le02;

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const v12, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v13, 0x7

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    move-wide/from16 v7, p3

    .line 19
    .line 20
    invoke-static/range {v7 .. v13}, Lq31;->a(JIIIII)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-interface {v0, v2, v3}, Ltr4;->o(J)Leo5;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget v0, v3, Leo5;->Y:I

    .line 29
    .line 30
    invoke-static/range {p3 .. p4}, Lq31;->g(J)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget v7, v3, Leo5;->X:I

    .line 39
    .line 40
    new-instance v0, Lk48;

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    move-object v1, p0

    .line 44
    move-object v4, p1

    .line 45
    invoke-direct/range {v0 .. v5}, Lk48;-><init>(Ln48;ILeo5;Lzr4;B)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v7, v2, v6, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_0
    const/4 v12, 0x0

    .line 54
    const/16 v13, 0xd

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const v10, 0x7fffffff

    .line 58
    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    move-wide/from16 v7, p3

    .line 62
    .line 63
    invoke-static/range {v7 .. v13}, Lq31;->a(JIIIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-interface {v0, v1, v2}, Ltr4;->o(J)Leo5;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget v0, v3, Leo5;->X:I

    .line 72
    .line 73
    invoke-static/range {p3 .. p4}, Lq31;->h(J)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget v7, v3, Leo5;->Y:I

    .line 82
    .line 83
    new-instance v0, Lk48;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    move-object v1, p0

    .line 87
    move-object v4, p1

    .line 88
    invoke-direct/range {v0 .. v5}, Lk48;-><init>(Ln48;ILeo5;Lzr4;B)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v2, v7, v6, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method

.method public final Q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln48;->w0:Lr68;

    .line 2
    .line 3
    iget-boolean v1, p0, Ln48;->s0:Z

    .line 4
    .line 5
    iput-boolean v1, v0, Lr68;->h:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ln48;->c1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ln48;->d1()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final c1()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Ln48;->y0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Ln48;->s0:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Ln48;->t0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Ln48;->x0:Ld90;

    .line 14
    .line 15
    instance-of v0, p0, Lfe7;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lfe7;

    .line 20
    .line 21
    iget-wide v0, p0, Lfe7;->a:J

    .line 22
    .line 23
    const-wide/16 v2, 0x10

    .line 24
    .line 25
    cmp-long p0, v0, v2

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final d1()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln48;->D0:Lo8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo8;

    .line 6
    .line 7
    sget-object v1, Ly01;->y:Lox1;

    .line 8
    .line 9
    invoke-static {p0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Lo8;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ln48;->D0:Lo8;

    .line 23
    .line 24
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lym7;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-direct {v1, p0, v2, v3}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2, v2, v1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ln48;->E0:Log7;

    .line 43
    .line 44
    return-void
.end method

.method public final e0(Li55;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln48;->u0:Ly78;

    .line 2
    .line 3
    iget-object v0, v0, Ly78;->d:Lrh5;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ln48;->J0:Ly58;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ly58;->e0(Li55;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e1(Ldo5;IIJLz24;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    move-wide/from16 v4, p4

    .line 8
    .line 9
    iget-object v3, v2, Ln48;->z0:Lay6;

    .line 10
    .line 11
    iget-object v3, v3, Lay6;->Y:Loh5;

    .line 12
    .line 13
    invoke-virtual {v3, v0}, Loh5;->m(I)V

    .line 14
    .line 15
    .line 16
    sub-int v3, v1, v0

    .line 17
    .line 18
    iget-object v6, v2, Ln48;->z0:Lay6;

    .line 19
    .line 20
    invoke-virtual {v6, v3}, Lay6;->a(I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v2, Ln48;->F0:Lf88;

    .line 24
    .line 25
    const-wide v6, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    sget v8, Lf88;->c:I

    .line 33
    .line 34
    and-long v8, v4, v6

    .line 35
    .line 36
    long-to-int v8, v8

    .line 37
    iget-wide v9, v3, Lf88;->a:J

    .line 38
    .line 39
    and-long v11, v9, v6

    .line 40
    .line 41
    long-to-int v3, v11

    .line 42
    if-ne v8, v3, :cond_1

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    shr-long v6, v4, v3

    .line 47
    .line 48
    long-to-int v6, v6

    .line 49
    shr-long v7, v9, v3

    .line 50
    .line 51
    long-to-int v3, v7

    .line 52
    if-ne v6, v3, :cond_2

    .line 53
    .line 54
    iget v3, v2, Ln48;->H0:I

    .line 55
    .line 56
    if-ne v1, v3, :cond_2

    .line 57
    .line 58
    iget v3, v2, Ln48;->I0:I

    .line 59
    .line 60
    if-eq v0, v3, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v6, -0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget v3, Lf88;->c:I

    .line 66
    .line 67
    and-long/2addr v6, v4

    .line 68
    long-to-int v6, v6

    .line 69
    :cond_2
    :goto_0
    if-ltz v6, :cond_12

    .line 70
    .line 71
    invoke-virtual {v2}, Ln48;->c1()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_3

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_3
    iget-object v3, v2, Ln48;->u0:Ly78;

    .line 80
    .line 81
    invoke-virtual {v3}, Ly78;->c()Lx78;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_4
    new-instance v7, Lkf3;

    .line 90
    .line 91
    iget-object v8, v3, Lx78;->a:Lw78;

    .line 92
    .line 93
    iget-object v8, v8, Lw78;->a:Lql;

    .line 94
    .line 95
    iget-object v8, v8, Lql;->Y:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x1

    .line 103
    invoke-direct {v7, v9, v8, v10}, Lif3;-><init>(III)V

    .line 104
    .line 105
    .line 106
    invoke-static {v6, v7}, Lx97;->o(ILvu0;)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {v3, v6}, Lx78;->c(I)Ls86;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    iget v3, v6, Ls86;->a:F

    .line 115
    .line 116
    iget v7, v6, Ls86;->c:F

    .line 117
    .line 118
    sget-object v8, Lz24;->Y:Lz24;

    .line 119
    .line 120
    move-object/from16 v11, p6

    .line 121
    .line 122
    if-ne v11, v8, :cond_5

    .line 123
    .line 124
    move v8, v10

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move v8, v9

    .line 127
    :goto_1
    const/high16 v11, 0x40000000    # 2.0f

    .line 128
    .line 129
    move-object/from16 v12, p1

    .line 130
    .line 131
    invoke-interface {v12, v11}, Lfi1;->x0(F)I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-eqz v8, :cond_6

    .line 136
    .line 137
    int-to-float v12, v1

    .line 138
    sub-float/2addr v12, v7

    .line 139
    goto :goto_2

    .line 140
    :cond_6
    move v12, v3

    .line 141
    :goto_2
    if-eqz v8, :cond_7

    .line 142
    .line 143
    int-to-float v3, v1

    .line 144
    sub-float/2addr v3, v7

    .line 145
    :cond_7
    int-to-float v7, v11

    .line 146
    add-float/2addr v3, v7

    .line 147
    int-to-float v7, v1

    .line 148
    cmpl-float v8, v3, v7

    .line 149
    .line 150
    if-lez v8, :cond_8

    .line 151
    .line 152
    move v3, v7

    .line 153
    :cond_8
    const/16 v7, 0xa

    .line 154
    .line 155
    invoke-static {v6, v12, v3, v7}, Ls86;->b(Ls86;FFI)Ls86;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget v7, v3, Ls86;->b:F

    .line 160
    .line 161
    iget v8, v3, Ls86;->a:F

    .line 162
    .line 163
    iget-object v11, v2, Ln48;->G0:Ls86;

    .line 164
    .line 165
    iget v12, v11, Ls86;->a:F

    .line 166
    .line 167
    cmpg-float v12, v8, v12

    .line 168
    .line 169
    if-nez v12, :cond_a

    .line 170
    .line 171
    iget v11, v11, Ls86;->b:F

    .line 172
    .line 173
    cmpg-float v11, v7, v11

    .line 174
    .line 175
    if-nez v11, :cond_a

    .line 176
    .line 177
    iget v11, v2, Ln48;->H0:I

    .line 178
    .line 179
    if-eq v1, v11, :cond_9

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_9
    move v11, v9

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    :goto_3
    move v11, v10

    .line 185
    :goto_4
    if-nez v11, :cond_b

    .line 186
    .line 187
    iget v12, v2, Ln48;->I0:I

    .line 188
    .line 189
    if-eq v0, v12, :cond_12

    .line 190
    .line 191
    :cond_b
    iget-object v12, v2, Ln48;->A0:Lsd5;

    .line 192
    .line 193
    sget-object v13, Lsd5;->X:Lsd5;

    .line 194
    .line 195
    if-ne v12, v13, :cond_c

    .line 196
    .line 197
    move v9, v10

    .line 198
    :cond_c
    if-eqz v9, :cond_d

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_d
    move v7, v8

    .line 202
    :goto_5
    if-eqz v9, :cond_e

    .line 203
    .line 204
    iget v8, v3, Ls86;->d:F

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_e
    iget v8, v3, Ls86;->c:F

    .line 208
    .line 209
    :goto_6
    iget-object v9, v2, Ln48;->z0:Lay6;

    .line 210
    .line 211
    iget-object v9, v9, Lay6;->X:Loh5;

    .line 212
    .line 213
    invoke-virtual {v9}, Loh5;->l()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    add-int v12, v9, v0

    .line 218
    .line 219
    int-to-float v12, v12

    .line 220
    cmpl-float v13, v8, v12

    .line 221
    .line 222
    if-lez v13, :cond_f

    .line 223
    .line 224
    :goto_7
    sub-float/2addr v8, v12

    .line 225
    goto :goto_8

    .line 226
    :cond_f
    int-to-float v9, v9

    .line 227
    cmpg-float v13, v7, v9

    .line 228
    .line 229
    if-gez v13, :cond_10

    .line 230
    .line 231
    sub-float v14, v8, v7

    .line 232
    .line 233
    int-to-float v15, v0

    .line 234
    cmpl-float v14, v14, v15

    .line 235
    .line 236
    if-lez v14, :cond_10

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_10
    if-gez v13, :cond_11

    .line 240
    .line 241
    sub-float/2addr v8, v7

    .line 242
    int-to-float v12, v0

    .line 243
    cmpg-float v8, v8, v12

    .line 244
    .line 245
    if-gtz v8, :cond_11

    .line 246
    .line 247
    sub-float v8, v7, v9

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_11
    const/4 v8, 0x0

    .line 251
    :goto_8
    new-instance v7, Lf88;

    .line 252
    .line 253
    invoke-direct {v7, v4, v5}, Lf88;-><init>(J)V

    .line 254
    .line 255
    .line 256
    iput-object v7, v2, Ln48;->F0:Lf88;

    .line 257
    .line 258
    iput-object v3, v2, Ln48;->G0:Ls86;

    .line 259
    .line 260
    iput v0, v2, Ln48;->I0:I

    .line 261
    .line 262
    iput v1, v2, Ln48;->H0:I

    .line 263
    .line 264
    invoke-virtual {v2}, Ljx4;->M0()Lb71;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    new-instance v0, Lm48;

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    move v1, v8

    .line 272
    move v3, v11

    .line 273
    invoke-direct/range {v0 .. v7}, Lm48;-><init>(FLn48;ZJLs86;Lq51;)V

    .line 274
    .line 275
    .line 276
    const/4 v1, 0x0

    .line 277
    sget-object v2, Le71;->f0:Le71;

    .line 278
    .line 279
    invoke-static {v9, v1, v2, v0, v10}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 280
    .line 281
    .line 282
    :cond_12
    :goto_9
    return-void
.end method

.method public final h(Lf17;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln48;->J0:Ly58;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ly58;->h(Lf17;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lp34;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Ln48;->v0:Lkd8;

    .line 7
    .line 8
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, Ln48;->u0:Ly78;

    .line 13
    .line 14
    invoke-virtual {v2}, Ly78;->c()Lx78;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    if-nez v7, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v2, v1, Lh48;->h0:Lqg5;

    .line 22
    .line 23
    iget-object v8, v1, Lh48;->h0:Lqg5;

    .line 24
    .line 25
    iget-wide v9, v1, Lh48;->f0:J

    .line 26
    .line 27
    const/4 v11, 0x1

    .line 28
    if-eqz v2, :cond_5

    .line 29
    .line 30
    iget-object v1, v2, Lqg5;->X:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lh78;

    .line 33
    .line 34
    iget-boolean v1, v1, Lh78;->a:Z

    .line 35
    .line 36
    iget-object v2, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lf88;

    .line 39
    .line 40
    iget-wide v2, v2, Lf88;->a:J

    .line 41
    .line 42
    invoke-static {v2, v3}, Lf88;->b(J)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v7, v4, v2}, Lx78;->j(II)Llf;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, v7, Lx78;->a:Lw78;

    .line 62
    .line 63
    iget-object v3, v3, Lw78;->b:Lo88;

    .line 64
    .line 65
    if-ne v1, v11, :cond_4

    .line 66
    .line 67
    iget-object v1, v3, Lo88;->a:Lqe7;

    .line 68
    .line 69
    iget-object v1, v1, Lqe7;->a:Lf78;

    .line 70
    .line 71
    invoke-interface {v1}, Lf78;->c()Ld90;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    const/16 v6, 0x38

    .line 79
    .line 80
    const v4, 0x3e4ccccd    # 0.2f

    .line 81
    .line 82
    .line 83
    move-object v3, v1

    .line 84
    move-object/from16 v1, p1

    .line 85
    .line 86
    invoke-static/range {v1 .. v6}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-object/from16 v1, p1

    .line 91
    .line 92
    invoke-virtual {v3}, Lo88;->b()J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    const-wide/16 v5, 0x10

    .line 97
    .line 98
    cmp-long v5, v3, v5

    .line 99
    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    sget-wide v3, Ldw0;->b:J

    .line 104
    .line 105
    :goto_0
    invoke-static {v3, v4}, Ldw0;->c(J)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    const v6, 0x3e4ccccd    # 0.2f

    .line 110
    .line 111
    .line 112
    mul-float/2addr v5, v6

    .line 113
    invoke-static {v5, v3, v4}, Ldw0;->b(FJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    invoke-virtual {v1, v2, v3, v4}, Lp34;->C0(Llf;J)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move-object/from16 v1, p1

    .line 122
    .line 123
    sget-object v3, Li88;->a:Lox1;

    .line 124
    .line 125
    invoke-static {v0, v3}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lh88;

    .line 130
    .line 131
    iget-wide v3, v3, Lh88;->b:J

    .line 132
    .line 133
    invoke-virtual {v1, v2, v3, v4}, Lp34;->C0(Llf;J)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    :goto_1
    move-object/from16 v1, p1

    .line 138
    .line 139
    :goto_2
    invoke-static {v9, v10}, Lf88;->b(J)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_13

    .line 144
    .line 145
    invoke-static {v1, v7}, Ln48;->b1(Lsv1;Lx78;)V

    .line 146
    .line 147
    .line 148
    if-nez v8, :cond_15

    .line 149
    .line 150
    iget-object v2, v0, Ln48;->x0:Ld90;

    .line 151
    .line 152
    invoke-virtual {v0}, Ln48;->c1()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    iget-object v4, v0, Ln48;->D0:Lo8;

    .line 157
    .line 158
    iget-object v5, v0, Ln48;->w0:Lr68;

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    iget-object v4, v4, Lo8;->f0:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Lnh5;

    .line 166
    .line 167
    invoke-virtual {v4}, Lnh5;->l()F

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    goto :goto_3

    .line 172
    :cond_6
    move v4, v6

    .line 173
    :goto_3
    cmpg-float v6, v4, v6

    .line 174
    .line 175
    if-nez v6, :cond_7

    .line 176
    .line 177
    goto/16 :goto_c

    .line 178
    .line 179
    :cond_7
    if-nez v3, :cond_8

    .line 180
    .line 181
    goto/16 :goto_c

    .line 182
    .line 183
    :cond_8
    invoke-virtual {v5}, Lr68;->k()Ls86;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iget v5, v3, Ls86;->c:F

    .line 188
    .line 189
    iget v6, v3, Ls86;->a:F

    .line 190
    .line 191
    sub-float/2addr v5, v6

    .line 192
    const/high16 v7, 0x40000000    # 2.0f

    .line 193
    .line 194
    div-float v7, v5, v7

    .line 195
    .line 196
    add-float/2addr v7, v6

    .line 197
    iget v6, v3, Ls86;->b:F

    .line 198
    .line 199
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    int-to-long v7, v7

    .line 204
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    int-to-long v9, v6

    .line 209
    const/16 v6, 0x20

    .line 210
    .line 211
    shl-long v6, v7, v6

    .line 212
    .line 213
    const-wide v12, 0xffffffffL

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    and-long v8, v9, v12

    .line 219
    .line 220
    or-long v13, v6, v8

    .line 221
    .line 222
    invoke-virtual {v3}, Ls86;->c()J

    .line 223
    .line 224
    .line 225
    move-result-wide v15

    .line 226
    iget-object v3, v1, Lp34;->X:Lum0;

    .line 227
    .line 228
    iget-object v6, v3, Lum0;->X:Ltm0;

    .line 229
    .line 230
    iget-object v12, v6, Ltm0;->c:Lsm0;

    .line 231
    .line 232
    iget-object v6, v3, Lum0;->f0:Ldf;

    .line 233
    .line 234
    if-nez v6, :cond_9

    .line 235
    .line 236
    invoke-static {}, Lu15;->c()Ldf;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-virtual {v6, v11}, Ldf;->m(I)V

    .line 241
    .line 242
    .line 243
    iput-object v6, v3, Lum0;->f0:Ldf;

    .line 244
    .line 245
    :cond_9
    iget-object v7, v6, Ldf;->a:Landroid/graphics/Paint;

    .line 246
    .line 247
    if-eqz v2, :cond_a

    .line 248
    .line 249
    invoke-interface {v3}, Lsv1;->e()J

    .line 250
    .line 251
    .line 252
    move-result-wide v8

    .line 253
    invoke-virtual {v2, v4, v8, v9, v6}, Ld90;->a(FJLdf;)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_a
    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    int-to-float v2, v2

    .line 262
    const/high16 v3, 0x437f0000    # 255.0f

    .line 263
    .line 264
    div-float/2addr v2, v3

    .line 265
    cmpg-float v2, v2, v4

    .line 266
    .line 267
    if-nez v2, :cond_b

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_b
    invoke-virtual {v6, v4}, Ldf;->d(F)V

    .line 271
    .line 272
    .line 273
    :goto_4
    iget-object v2, v6, Ldf;->d:Lg60;

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-nez v2, :cond_c

    .line 281
    .line 282
    invoke-virtual {v6, v3}, Ldf;->g(Lg60;)V

    .line 283
    .line 284
    .line 285
    :cond_c
    iget v2, v6, Ldf;->b:I

    .line 286
    .line 287
    const/4 v3, 0x3

    .line 288
    if-ne v2, v3, :cond_d

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_d
    invoke-virtual {v6, v3}, Ldf;->e(I)V

    .line 292
    .line 293
    .line 294
    :goto_5
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    cmpg-float v2, v2, v5

    .line 299
    .line 300
    if-nez v2, :cond_e

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_e
    invoke-virtual {v6, v5}, Ldf;->l(F)V

    .line 304
    .line 305
    .line 306
    :goto_6
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    const/high16 v3, 0x40800000    # 4.0f

    .line 311
    .line 312
    cmpg-float v2, v2, v3

    .line 313
    .line 314
    if-nez v2, :cond_f

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_f
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 318
    .line 319
    .line 320
    :goto_7
    invoke-virtual {v6}, Ldf;->b()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    const/4 v3, 0x0

    .line 325
    if-nez v2, :cond_10

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_10
    invoke-virtual {v6, v3}, Ldf;->j(I)V

    .line 329
    .line 330
    .line 331
    :goto_8
    invoke-virtual {v6}, Ldf;->c()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-nez v2, :cond_11

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_11
    invoke-virtual {v6, v3}, Ldf;->k(I)V

    .line 339
    .line 340
    .line 341
    :goto_9
    invoke-virtual {v7}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-ne v2, v11, :cond_12

    .line 346
    .line 347
    :goto_a
    move-object/from16 v17, v6

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_12
    invoke-virtual {v6, v11}, Ldf;->h(I)V

    .line 351
    .line 352
    .line 353
    goto :goto_a

    .line 354
    :goto_b
    invoke-interface/range {v12 .. v17}, Lsm0;->h(JJLdf;)V

    .line 355
    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_13
    if-nez v8, :cond_14

    .line 359
    .line 360
    invoke-static {v9, v10}, Lf88;->d(J)I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-static {v9, v10}, Lf88;->c(J)I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    if-eq v2, v3, :cond_14

    .line 369
    .line 370
    sget-object v4, Li88;->a:Lox1;

    .line 371
    .line 372
    invoke-static {v0, v4}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    check-cast v4, Lh88;

    .line 377
    .line 378
    iget-wide v4, v4, Lh88;->b:J

    .line 379
    .line 380
    invoke-virtual {v7, v2, v3}, Lx78;->j(II)Llf;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v1, v2, v4, v5}, Lp34;->C0(Llf;J)V

    .line 385
    .line 386
    .line 387
    :cond_14
    invoke-static {v1, v7}, Ln48;->b1(Lsv1;Lx78;)V

    .line 388
    .line 389
    .line 390
    :cond_15
    :goto_c
    iget-object v0, v0, Ln48;->J0:Ly58;

    .line 391
    .line 392
    invoke-virtual {v0, v1}, Ly58;->u0(Lp34;)V

    .line 393
    .line 394
    .line 395
    return-void
.end method
