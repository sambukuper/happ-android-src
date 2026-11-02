.class public final Lkd8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ly68;

.field public b:Lde3;

.field public final c:Lqe4;

.field public final d:Lzi1;

.field public final e:Lrh5;


# direct methods
.method public constructor <init>(Ly68;Lde3;Lqe4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkd8;->a:Ly68;

    .line 5
    .line 6
    iput-object p2, p0, Lkd8;->b:Lde3;

    .line 7
    .line 8
    iput-object p3, p0, Lkd8;->c:Lqe4;

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    new-instance p1, Lf98;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-direct {p1, p0, p3, p2}, Lf98;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    iput-object p1, p0, Lkd8;->d:Lzi1;

    .line 25
    .line 26
    new-instance p1, Lr07;

    .line 27
    .line 28
    sget-object p2, Lf09;->X:Lf09;

    .line 29
    .line 30
    invoke-direct {p1, p2, p2}, Lr07;-><init>(Lf09;Lf09;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lkd8;->e:Lrh5;

    .line 38
    .line 39
    return-void
.end method

.method public static h(Lkd8;Ljava/lang/CharSequence;ZZI)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    and-int/lit8 v1, p4, 0x2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    and-int/lit8 v4, p4, 0x4

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    sget-object v4, Le58;->X:Le58;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    sget-object v4, Le58;->Y:Le58;

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v5, p4, 0x8

    .line 22
    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    move v5, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move/from16 v5, p2

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v6, p4, 0x10

    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    move v12, v3

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move/from16 v12, p3

    .line 36
    .line 37
    :goto_3
    iget-object v3, v0, Lkd8;->a:Ly68;

    .line 38
    .line 39
    iget-object v6, v0, Lkd8;->b:Lde3;

    .line 40
    .line 41
    iget-object v7, v3, Ly68;->b:Lg48;

    .line 42
    .line 43
    invoke-virtual {v7}, Lg48;->a()Lmj0;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Lmj0;->A()V

    .line 48
    .line 49
    .line 50
    iget-object v7, v3, Ly68;->b:Lg48;

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v7, v1}, Lg48;->f(Lf88;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-wide v14, v7, Lg48;->i0:J

    .line 59
    .line 60
    invoke-static {v14, v15}, Lf88;->d(J)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    invoke-static {v14, v15}, Lf88;->c(J)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const/4 v11, 0x0

    .line 69
    const/16 v13, 0x18

    .line 70
    .line 71
    move-object/from16 v10, p1

    .line 72
    .line 73
    invoke-static/range {v7 .. v13}, Lg48;->d(Lg48;IILjava/lang/CharSequence;IZI)V

    .line 74
    .line 75
    .line 76
    invoke-static {v14, v15}, Lf88;->d(J)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    add-int/2addr v8, v1

    .line 85
    invoke-static {v7, v8, v8}, Lmn7;->g(Lg48;II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v7}, Lkd8;->l(Lg48;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v6, v5, v4}, Ly68;->b(Lde3;ZLe58;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v2}, Ly68;->f(Z)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v3, Ly68;->b:Lg48;

    .line 98
    .line 99
    iget-boolean v0, v0, Lg48;->g0:Z

    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ly68;->e(Z)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public static i(Lkd8;Ljava/lang/String;JZZI)V
    .locals 9

    .line 1
    and-int/lit8 v0, p6, 0x8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p4, v1

    .line 7
    :cond_0
    and-int/lit8 p6, p6, 0x10

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    const/4 p5, 0x0

    .line 12
    :cond_1
    move v7, p5

    .line 13
    iget-object p5, p0, Lkd8;->a:Ly68;

    .line 14
    .line 15
    iget-object p6, p0, Lkd8;->b:Lde3;

    .line 16
    .line 17
    iget-object v0, p5, Ly68;->b:Lg48;

    .line 18
    .line 19
    invoke-virtual {v0}, Lg48;->a()Lmj0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lmj0;->A()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p5, Ly68;->b:Lg48;

    .line 27
    .line 28
    invoke-virtual {p0, p2, p3}, Lkd8;->e(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    invoke-static {p2, p3}, Lf88;->d(J)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {p2, p3}, Lf88;->c(J)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v6, 0x0

    .line 41
    const/16 v8, 0x18

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    invoke-static/range {v2 .. v8}, Lg48;->d(Lg48;IILjava/lang/CharSequence;IZI)V

    .line 45
    .line 46
    .line 47
    invoke-static {p2, p3}, Lf88;->d(J)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-int/2addr p2, p1

    .line 56
    invoke-static {v2, p2, p2}, Lmn7;->g(Lg48;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lkd8;->l(Lg48;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Le58;->X:Le58;

    .line 63
    .line 64
    invoke-virtual {p5, p6, p4, p0}, Ly68;->b(Lde3;ZLe58;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p5, v1}, Ly68;->f(Z)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p5, Ly68;->b:Lg48;

    .line 71
    .line 72
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 73
    .line 74
    invoke-virtual {p5, p0}, Ly68;->e(Z)V

    .line 75
    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkd8;->b:Lde3;

    .line 2
    .line 3
    iget-object p0, p0, Lkd8;->a:Ly68;

    .line 4
    .line 5
    iget-object v1, p0, Ly68;->b:Lg48;

    .line 6
    .line 7
    invoke-virtual {v1}, Lg48;->a()Lmj0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lmj0;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Ly68;->b:Lg48;

    .line 15
    .line 16
    iget-wide v2, v1, Lg48;->i0:J

    .line 17
    .line 18
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v1, v2, v2}, Lmn7;->g(Lg48;II)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    sget-object v2, Le58;->X:Le58;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1, v2}, Ly68;->b(Lde3;ZLe58;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ly68;->f(Z)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ly68;->b:Lg48;

    .line 35
    .line 36
    iget-boolean v0, v0, Lg48;->g0:Z

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ly68;->e(Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final b(Llh;Ls51;)V
    .locals 4

    .line 1
    instance-of v0, p2, Ljd8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ljd8;

    .line 7
    .line 8
    iget v1, v0, Ljd8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ljd8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljd8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ljd8;-><init>(Lkd8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ljd8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ljd8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput v2, v0, Ljd8;->h0:I

    .line 48
    .line 49
    new-instance p2, Lmm0;

    .line 50
    .line 51
    invoke-static {v0}, Lmb6;->H(Lq51;)Lq51;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p2, v2, v0}, Lmm0;-><init>(ILq51;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lmm0;->s()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 62
    .line 63
    iget-object v0, v0, Ly68;->h:Lc15;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ld3;

    .line 69
    .line 70
    const/16 v1, 0x12

    .line 71
    .line 72
    invoke-direct {v0, p0, p1, v1}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v0}, Lmm0;->u(Lgn2;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lmm0;->q()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    sget-object p1, Lc71;->X:Lc71;

    .line 83
    .line 84
    if-ne p0, p1, :cond_3

    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    :goto_1
    invoke-static {}, Lb61;->n()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final c(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lkd8;->b:Lde3;

    .line 2
    .line 3
    iget-object v1, p0, Lkd8;->a:Ly68;

    .line 4
    .line 5
    iget-object v2, v1, Ly68;->b:Lg48;

    .line 6
    .line 7
    invoke-virtual {v2}, Lg48;->a()Lmj0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lmj0;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v1, Ly68;->b:Lg48;

    .line 15
    .line 16
    iget-wide v4, v3, Lg48;->i0:J

    .line 17
    .line 18
    invoke-static {v4, v5}, Lf88;->d(J)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    iget-wide v5, v3, Lg48;->i0:J

    .line 23
    .line 24
    invoke-static {v5, v6}, Lf88;->c(J)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v7, 0x0

    .line 29
    const/16 v9, 0x18

    .line 30
    .line 31
    const-string v6, ""

    .line 32
    .line 33
    move v8, p1

    .line 34
    invoke-static/range {v3 .. v9}, Lg48;->d(Lg48;IILjava/lang/CharSequence;IZI)V

    .line 35
    .line 36
    .line 37
    iget-wide v4, v3, Lg48;->i0:J

    .line 38
    .line 39
    invoke-static {v4, v5}, Lf88;->d(J)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {v3, p1, p1}, Lmn7;->g(Lg48;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Lkd8;->l(Lg48;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    sget-object p1, Le58;->Y:Le58;

    .line 51
    .line 52
    invoke-virtual {v1, v0, p0, p1}, Ly68;->b(Lde3;ZLe58;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ly68;->f(Z)V

    .line 56
    .line 57
    .line 58
    iget-object p0, v1, Ly68;->b:Lg48;

    .line 59
    .line 60
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ly68;->e(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final d()Lh48;
    .locals 1

    .line 1
    iget-object v0, p0, Lkd8;->d:Lzi1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lid8;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, v0, Lid8;->a:Lh48;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lkd8;->a:Ly68;

    .line 17
    .line 18
    invoke-virtual {p0}, Ly68;->c()Lh48;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final e(J)J
    .locals 6

    .line 1
    iget-object p0, p0, Lkd8;->d:Lzi1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lid8;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lid8;->b:Lqf3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p0, :cond_3

    .line 18
    .line 19
    sget v0, Lf88;->c:I

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    shr-long v0, p1, v0

    .line 24
    .line 25
    long-to-int v0, v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p0, v0, v1}, Lqf3;->a(IZ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {p1, p2}, Lf88;->b(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-wide v0, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-wide v4, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v4, p1

    .line 45
    long-to-int v0, v4

    .line 46
    invoke-virtual {p0, v0, v1}, Lqf3;->a(IZ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    :goto_1
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {p0, v4}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v0, v1}, Lf88;->c(J)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {p1, p2}, Lf88;->e(J)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    invoke-static {v0, p0}, Lct7;->c(II)J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    return-wide p0

    .line 85
    :cond_2
    invoke-static {p0, v0}, Lct7;->c(II)J

    .line 86
    .line 87
    .line 88
    move-result-wide p0

    .line 89
    return-wide p0

    .line 90
    :cond_3
    return-wide p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lkd8;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lkd8;

    .line 12
    .line 13
    iget-object v1, p1, Lkd8;->a:Ly68;

    .line 14
    .line 15
    iget-object v3, p0, Lkd8;->a:Ly68;

    .line 16
    .line 17
    invoke-static {v3, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object p0, p0, Lkd8;->c:Lqe4;

    .line 25
    .line 26
    iget-object p1, p1, Lkd8;->c:Lqe4;

    .line 27
    .line 28
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final f(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lkd8;->d:Lzi1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lid8;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lid8;->b:Lqf3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lkd8;->e:Lrh5;

    .line 20
    .line 21
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lr07;

    .line 26
    .line 27
    invoke-static {p1, p2, v0, p0}, Lqp7;->i(JLqf3;Lr07;)J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :cond_1
    return-wide p1
.end method

.method public final g(Ljava/lang/CharSequence;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lkd8;->b:Lde3;

    .line 2
    .line 3
    iget-object v1, p0, Lkd8;->a:Ly68;

    .line 4
    .line 5
    iget-object v2, v1, Ly68;->b:Lg48;

    .line 6
    .line 7
    invoke-virtual {v2}, Lg48;->a()Lmj0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lmj0;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Ly68;->b:Lg48;

    .line 15
    .line 16
    iget-object v3, v2, Lg48;->Z:Lmi5;

    .line 17
    .line 18
    invoke-virtual {v3}, Lmi5;->length()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, ""

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-virtual {v2, v5, v3, v4}, Lg48;->c(IILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v2, p1}, Lg48;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lkd8;->l(Lg48;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    sget-object p1, Le58;->X:Le58;

    .line 40
    .line 41
    invoke-virtual {v1, v0, p0, p1}, Ly68;->b(Lde3;ZLe58;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p0}, Ly68;->f(Z)V

    .line 45
    .line 46
    .line 47
    iget-object p0, v1, Ly68;->b:Lg48;

    .line 48
    .line 49
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ly68;->e(Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lkd8;->c:Lqe4;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    return v0
.end method

.method public final j(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkd8;->e(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lkd8;->k(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lkd8;->b:Lde3;

    .line 2
    .line 3
    iget-object p0, p0, Lkd8;->a:Ly68;

    .line 4
    .line 5
    iget-object v1, p0, Ly68;->b:Lg48;

    .line 6
    .line 7
    invoke-virtual {v1}, Lg48;->a()Lmj0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lmj0;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Ly68;->b:Lg48;

    .line 15
    .line 16
    sget v2, Lf88;->c:I

    .line 17
    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    shr-long v2, p1, v2

    .line 21
    .line 22
    long-to-int v2, v2

    .line 23
    const-wide v3, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr p1, v3

    .line 29
    long-to-int p1, p1

    .line 30
    invoke-static {v1, v2, p1}, Lmn7;->g(Lg48;II)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    sget-object p2, Le58;->X:Le58;

    .line 35
    .line 36
    invoke-virtual {p0, v0, p1, p2}, Ly68;->b(Lde3;ZLe58;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ly68;->f(Z)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Ly68;->b:Lg48;

    .line 43
    .line 44
    iget-boolean p1, p1, Lg48;->g0:Z

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ly68;->e(Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final l(Lg48;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg48;->a()Lmj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lmj0;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lc15;

    .line 8
    .line 9
    iget v0, v0, Lc15;->Z:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p1, Lg48;->i0:J

    .line 14
    .line 15
    invoke-static {v0, v1}, Lf88;->b(J)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Lr07;

    .line 22
    .line 23
    sget-object v0, Lf09;->X:Lf09;

    .line 24
    .line 25
    invoke-direct {p1, v0, v0}, Lr07;-><init>(Lf09;Lf09;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lkd8;->e:Lrh5;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly68;->c()Lh48;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lkd8;->d()Lh48;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "TransformedTextFieldState(textFieldState="

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", outputTransformation=null, outputTransformedText=null, codepointTransformation="

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lkd8;->c:Lqe4;

    .line 27
    .line 28
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", codepointTransformedText="

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lkd8;->d:Lzi1;

    .line 37
    .line 38
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, ", outputText=\""

    .line 42
    .line 43
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "\", visualText=\""

    .line 50
    .line 51
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "\")"

    .line 58
    .line 59
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
