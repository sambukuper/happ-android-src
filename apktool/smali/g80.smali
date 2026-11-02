.class public abstract Lg80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ls05;

.field public static final b:Ls05;

.field public static final c:Lld;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lg80;->b(Z)Ls05;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lg80;->a:Ls05;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lg80;->b(Z)Ls05;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lg80;->b:Ls05;

    .line 14
    .line 15
    sget-object v0, Lld;->e:Lld;

    .line 16
    .line 17
    sput-object v0, Lg80;->c:Lld;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lkx4;Llp2;I)V
    .locals 7

    .line 1
    const v0, -0xc96ce69

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p1, v0, v1}, Llp2;->N(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-wide v0, p1, Llp2;->T:J

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {p1, p0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v5, Luz0;->j:Lpz2;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Llp2;->Z()V

    .line 54
    .line 55
    .line 56
    iget-boolean v5, p1, Llp2;->S:Z

    .line 57
    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Llp2;->k()V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {p1}, Llp2;->j0()V

    .line 65
    .line 66
    .line 67
    :goto_2
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 68
    .line 69
    sget-object v6, Lg80;->c:Lld;

    .line 70
    .line 71
    invoke-static {v5, p1, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v5, Lpz2;->A0:Ldx0;

    .line 75
    .line 76
    invoke-static {v5, p1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lpn7;->l(Llp2;)V

    .line 80
    .line 81
    .line 82
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 83
    .line 84
    invoke-static {v2, p1, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, Lpz2;->C0:Ldx0;

    .line 92
    .line 93
    invoke-static {v1, p1, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, Llp2;->p(Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 101
    .line 102
    .line 103
    :goto_3
    invoke-virtual {p1}, Llp2;->r()Lj86;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    new-instance v0, Lf80;

    .line 110
    .line 111
    invoke-direct {v0, p0, p2, v3}, Lf80;-><init>(Lkx4;IB)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p1, Lj86;->d:Lrn2;

    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method public static final b(Z)Ls05;
    .locals 3

    .line 1
    new-instance v0, Ls05;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls05;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lpz2;->Z:Lp50;

    .line 9
    .line 10
    new-instance v2, Lk80;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lpz2;->f0:Lp50;

    .line 19
    .line 20
    new-instance v2, Lk80;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lpz2;->g0:Lp50;

    .line 29
    .line 30
    new-instance v2, Lk80;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lpz2;->h0:Lp50;

    .line 39
    .line 40
    new-instance v2, Lk80;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lpz2;->i0:Lp50;

    .line 49
    .line 50
    new-instance v2, Lk80;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lpz2;->j0:Lp50;

    .line 59
    .line 60
    new-instance v2, Lk80;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lpz2;->k0:Lp50;

    .line 69
    .line 70
    new-instance v2, Lk80;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lpz2;->l0:Lp50;

    .line 79
    .line 80
    new-instance v2, Lk80;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lpz2;->m0:Lp50;

    .line 89
    .line 90
    new-instance v2, Lk80;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, Lk80;-><init>(Lp50;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static final c(Lp50;Z)Lxr4;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lg80;->a:Ls05;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lg80;->b:Ls05;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {v0, p0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lxr4;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lk80;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lk80;-><init>(Lp50;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public static final d(Ldo5;Leo5;Ltr4;Lz24;IILp50;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Ltr4;->w()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, Le80;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, Le80;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, Le80;->q0:Lp50;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, Leo5;->X:I

    .line 24
    .line 25
    iget p6, p1, Leo5;->Y:I

    .line 26
    .line 27
    int-to-long v1, p2

    .line 28
    const/16 p2, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p2

    .line 31
    int-to-long v3, p6

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    or-long/2addr v1, v3

    .line 39
    int-to-long v3, p4

    .line 40
    shl-long/2addr v3, p2

    .line 41
    int-to-long p4, p5

    .line 42
    and-long/2addr p4, v5

    .line 43
    or-long/2addr v3, p4

    .line 44
    move-object v5, p3

    .line 45
    invoke-virtual/range {v0 .. v5}, Lp50;->a(JJLz24;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-static {p0, p1, p2, p3}, Ldo5;->g(Ldo5;Leo5;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
