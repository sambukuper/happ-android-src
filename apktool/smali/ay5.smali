.class public final Lay5;
.super Lbq2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i0:Lay5;

.field public static final j0:Lau3;


# instance fields
.field public final X:Ljb0;

.field public Y:I

.field public Z:I

.field public f0:Lzx5;

.field public g0:B

.field public h0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lau3;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lau3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lay5;->j0:Lau3;

    .line 8
    .line 9
    new-instance v0, Lay5;

    .line 10
    .line 11
    invoke-direct {v0}, Lay5;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lay5;->i0:Lay5;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Lay5;->Z:I

    .line 18
    .line 19
    sget-object v1, Lzx5;->r0:Lzx5;

    .line 20
    .line 21
    iput-object v1, v0, Lay5;->f0:Lzx5;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 168
    iput-byte v0, p0, Lay5;->g0:B

    .line 169
    iput v0, p0, Lay5;->h0:I

    .line 170
    sget-object v0, Ljb0;->X:Lmc4;

    iput-object v0, p0, Lay5;->X:Ljb0;

    return-void
.end method

.method public constructor <init>(Liv0;Lr62;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lay5;->g0:B

    .line 6
    .line 7
    iput v0, p0, Lay5;->h0:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lay5;->Z:I

    .line 11
    .line 12
    sget-object v1, Lzx5;->r0:Lzx5;

    .line 13
    .line 14
    iput-object v1, p0, Lay5;->f0:Lzx5;

    .line 15
    .line 16
    new-instance v1, Lib0;

    .line 17
    .line 18
    invoke-direct {v1}, Lib0;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-static {v1, v2}, Lnv0;->G(Ljava/io/OutputStream;I)Lnv0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p1}, Liv0;->n()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    if-eq v4, v5, :cond_5

    .line 37
    .line 38
    const/16 v5, 0x12

    .line 39
    .line 40
    if-eq v4, v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1, v4, v3}, Liv0;->q(ILnv0;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    :cond_1
    move v0, v2

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_4

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :catch_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    iget v4, p0, Lay5;->Y:I

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    and-int/2addr v4, v5

    .line 60
    if-ne v4, v5, :cond_3

    .line 61
    .line 62
    iget-object v4, p0, Lay5;->f0:Lzx5;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lxx5;->g()Lxx5;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6, v4}, Lxx5;->h(Lzx5;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v6, 0x0

    .line 76
    :goto_1
    sget-object v4, Lzx5;->s0:Lau3;

    .line 77
    .line 78
    invoke-virtual {p1, v4, p2}, Liv0;->g(Lau3;Lr62;)Ld2;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lzx5;

    .line 83
    .line 84
    iput-object v4, p0, Lay5;->f0:Lzx5;

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-virtual {v6, v4}, Lxx5;->h(Lzx5;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Lxx5;->f()Lzx5;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iput-object v4, p0, Lay5;->f0:Lzx5;

    .line 96
    .line 97
    :cond_4
    iget v4, p0, Lay5;->Y:I

    .line 98
    .line 99
    or-int/2addr v4, v5

    .line 100
    iput v4, p0, Lay5;->Y:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    iget v4, p0, Lay5;->Y:I

    .line 104
    .line 105
    or-int/2addr v4, v2

    .line 106
    iput v4, p0, Lay5;->Y:I

    .line 107
    .line 108
    invoke-virtual {p1}, Liv0;->k()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    iput v4, p0, Lay5;->Z:I
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :goto_2
    :try_start_1
    new-instance p2, Lrh3;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p2, p1}, Lrh3;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iput-object p0, p2, Lrh3;->X:Ld2;

    .line 125
    .line 126
    throw p2

    .line 127
    :goto_3
    iput-object p0, p1, Lrh3;->X:Ld2;

    .line 128
    .line 129
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :goto_4
    :try_start_2
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    .line 132
    .line 133
    :catch_2
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    iput-object p2, p0, Lay5;->X:Ljb0;

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :catchall_1
    move-exception p1

    .line 141
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iput-object p2, p0, Lay5;->X:Ljb0;

    .line 146
    .line 147
    throw p1

    .line 148
    :goto_5
    throw p1

    .line 149
    :cond_6
    :try_start_3
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 150
    .line 151
    .line 152
    :catch_3
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lay5;->X:Ljb0;

    .line 157
    .line 158
    return-void

    .line 159
    :catchall_2
    move-exception p1

    .line 160
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    iput-object p2, p0, Lay5;->X:Ljb0;

    .line 165
    .line 166
    throw p1
.end method

.method public constructor <init>(Lwx5;)V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 172
    iput-byte v0, p0, Lay5;->g0:B

    .line 173
    iput v0, p0, Lay5;->h0:I

    .line 174
    iget-object p1, p1, Lup2;->X:Ljb0;

    .line 175
    iput-object p1, p0, Lay5;->X:Ljb0;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Lay5;->h0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lay5;->Y:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lay5;->Z:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lnv0;->l(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lay5;->Y:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lay5;->f0:Lzx5;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lnv0;->n(ILd2;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget-object v1, p0, Lay5;->X:Ljb0;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljb0;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p0, Lay5;->h0:I

    .line 42
    .line 43
    return v1
.end method

.method public final c()Lup2;
    .locals 1

    .line 1
    new-instance p0, Lwx5;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lwx5;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lzx5;->r0:Lzx5;

    .line 8
    .line 9
    iput-object v0, p0, Lwx5;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p0
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lay5;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Lay5;->Y:I

    .line 12
    .line 13
    and-int/lit8 v3, v0, 0x1

    .line 14
    .line 15
    if-ne v3, v1, :cond_4

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    and-int/2addr v0, v3

    .line 19
    if-ne v0, v3, :cond_3

    .line 20
    .line 21
    iget-object v0, p0, Lay5;->f0:Lzx5;

    .line 22
    .line 23
    invoke-virtual {v0}, Lzx5;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iput-byte v2, p0, Lay5;->g0:B

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    iput-byte v1, p0, Lay5;->g0:B

    .line 33
    .line 34
    return v1

    .line 35
    :cond_3
    iput-byte v2, p0, Lay5;->g0:B

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iput-byte v2, p0, Lay5;->g0:B

    .line 39
    .line 40
    return v2
.end method

.method public final e()Lup2;
    .locals 2

    .line 1
    new-instance v0, Lwx5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwx5;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lzx5;->r0:Lzx5;

    .line 8
    .line 9
    iput-object v1, v0, Lwx5;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lwx5;->h(Lay5;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final f(Lnv0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lay5;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lay5;->Y:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lay5;->Z:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnv0;->V(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lay5;->Y:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lay5;->f0:Lzx5;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnv0;->X(ILd2;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lay5;->X:Ljb0;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lnv0;->a0(Ljb0;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
