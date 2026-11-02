.class public abstract Ldd;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x41c80000    # 25.0f

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    const v1, 0x401a827a

    .line 7
    .line 8
    .line 9
    div-float/2addr v0, v1

    .line 10
    sput v0, Ldd;->a:F

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Lv30;Lkx4;JLlp2;I)V
    .locals 6

    .line 1
    const v0, 0x69deb1cb

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p5

    .line 18
    invoke-virtual {p4, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    and-int/lit16 v2, v0, 0x93

    .line 31
    .line 32
    const/16 v3, 0x92

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    move v2, v5

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v2, v4

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p4, v3, v2}, Llp2;->N(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_8

    .line 48
    .line 49
    invoke-virtual {p4}, Llp2;->S()V

    .line 50
    .line 51
    .line 52
    and-int/lit8 v2, p5, 0x1

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    invoke-virtual {p4}, Llp2;->x()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-virtual {p4}, Llp2;->Q()V

    .line 64
    .line 65
    .line 66
    :cond_4
    :goto_3
    invoke-virtual {p4}, Llp2;->q()V

    .line 67
    .line 68
    .line 69
    and-int/lit8 v0, v0, 0xe

    .line 70
    .line 71
    if-eq v0, v1, :cond_5

    .line 72
    .line 73
    move v5, v4

    .line 74
    :cond_5
    invoke-virtual {p4}, Llp2;->K()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v5, :cond_6

    .line 79
    .line 80
    sget-object v2, Lzz0;->a:Lbe;

    .line 81
    .line 82
    if-ne v1, v2, :cond_7

    .line 83
    .line 84
    :cond_6
    new-instance v1, Ly0;

    .line 85
    .line 86
    const/16 v2, 0x8

    .line 87
    .line 88
    invoke-direct {v1, p0, v2}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    check-cast v1, Lgn2;

    .line 95
    .line 96
    invoke-static {p1, v4, v1}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v2, Lpz2;->f0:Lp50;

    .line 101
    .line 102
    new-instance v3, Lyc;

    .line 103
    .line 104
    invoke-direct {v3, p2, p3, v1}, Lyc;-><init>(JLkx4;)V

    .line 105
    .line 106
    .line 107
    const v1, -0x628ed1fe

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v3, p4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    or-int/lit16 v0, v0, 0x1b0

    .line 115
    .line 116
    invoke-static {p0, v2, v1, p4, v0}, Lw45;->a(Lv30;Lq8;Lzy0;Llp2;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    invoke-virtual {p4}, Llp2;->Q()V

    .line 121
    .line 122
    .line 123
    :goto_4
    invoke-virtual {p4}, Llp2;->r()Lj86;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    if-eqz p4, :cond_9

    .line 128
    .line 129
    new-instance v0, Lzc;

    .line 130
    .line 131
    move-object v1, p0

    .line 132
    move-object v2, p1

    .line 133
    move-wide v3, p2

    .line 134
    move v5, p5

    .line 135
    invoke-direct/range {v0 .. v5}, Lzc;-><init>(Lv30;Lkx4;JI)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p4, Lj86;->d:Lrn2;

    .line 139
    .line 140
    :cond_9
    return-void
.end method

.method public static final b(Lkx4;Llp2;II)V
    .locals 6

    .line 1
    const v0, 0x29616e63

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    or-int/lit8 v2, p2, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p1, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_0
    or-int/2addr v2, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v2, 0x3

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v3, v1, :cond_2

    .line 30
    .line 31
    move v1, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v1, v4

    .line 34
    :goto_2
    and-int/2addr v2, v5

    .line 35
    invoke-virtual {p1, v2, v1}, Llp2;->N(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    sget-object p0, Lhx4;->X:Lhx4;

    .line 44
    .line 45
    :cond_3
    sget v0, Ldd;->a:F

    .line 46
    .line 47
    const/high16 v1, 0x41c80000    # 25.0f

    .line 48
    .line 49
    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/b;->h(Lkx4;FF)Lkx4;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Li88;->a:Lox1;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lh88;

    .line 60
    .line 61
    iget-wide v1, v1, Lh88;->a:J

    .line 62
    .line 63
    new-instance v3, Lbd;

    .line 64
    .line 65
    invoke-direct {v3, v1, v2, v4}, Lbd;-><init>(JB)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v3}, Lw79;->s(Lkx4;Lgn2;)Lkx4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-virtual {p1}, Llp2;->Q()V

    .line 77
    .line 78
    .line 79
    :goto_3
    invoke-virtual {p1}, Llp2;->r()Lj86;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    new-instance v0, Lad;

    .line 86
    .line 87
    invoke-direct {v0, p0, p2, p3}, Lad;-><init>(Lkx4;II)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p1, Lj86;->d:Lrn2;

    .line 91
    .line 92
    :cond_5
    return-void
.end method
