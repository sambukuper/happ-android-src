.class public final Lmz5;
.super Lxp2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:I

.field public g0:Ljava/util/List;

.field public h0:Z

.field public i0:I

.field public j0:Lnz5;

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:I

.field public p0:Lnz5;

.field public q0:I

.field public r0:Lnz5;

.field public s0:I

.field public t0:I

.field public u0:Ljava/util/List;


# direct methods
.method public static h()Lmz5;
    .locals 3

    .line 1
    new-instance v0, Lmz5;

    .line 2
    .line 3
    invoke-direct {v0}, Lxp2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Lmz5;->g0:Ljava/util/List;

    .line 9
    .line 10
    sget-object v2, Lnz5;->w0:Lnz5;

    .line 11
    .line 12
    iput-object v2, v0, Lmz5;->j0:Lnz5;

    .line 13
    .line 14
    iput-object v2, v0, Lmz5;->p0:Lnz5;

    .line 15
    .line 16
    iput-object v2, v0, Lmz5;->r0:Lnz5;

    .line 17
    .line 18
    iput-object v1, v0, Lmz5;->u0:Ljava/util/List;

    .line 19
    .line 20
    return-object v0
.end method


# virtual methods
.method public final b()Ld2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lmz5;->g()Lnz5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnz5;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lxm8;

    .line 13
    .line 14
    invoke-direct {p0}, Lxm8;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public final c(Liv0;Lr62;)Lup2;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lnz5;->x0:Lau3;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Lnz5;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2}, Lnz5;-><init>(Liv0;Lr62;)V
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lmz5;->i(Lnz5;)Lmz5;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object p2, p1, Lrh3;->X:Ld2;

    .line 20
    .line 21
    check-cast p2, Lnz5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lmz5;->i(Lnz5;)Lmz5;

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lmz5;->h()Lmz5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lmz5;->g()Lnz5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lmz5;->i(Lnz5;)Lmz5;

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic e(Lbq2;)Lup2;
    .locals 0

    .line 1
    check-cast p1, Lnz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmz5;->i(Lnz5;)Lmz5;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g()Lnz5;
    .locals 6

    .line 1
    new-instance v0, Lnz5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnz5;-><init>(Lmz5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lmz5;->f0:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lmz5;->g0:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, p0, Lmz5;->g0:Ljava/util/List;

    .line 20
    .line 21
    iget v2, p0, Lmz5;->f0:I

    .line 22
    .line 23
    and-int/lit8 v2, v2, -0x2

    .line 24
    .line 25
    iput v2, p0, Lmz5;->f0:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v2, v1

    .line 29
    :goto_0
    iget-object v4, p0, Lmz5;->g0:Ljava/util/List;

    .line 30
    .line 31
    iput-object v4, v0, Lnz5;->f0:Ljava/util/List;

    .line 32
    .line 33
    and-int/lit8 v4, v1, 0x2

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v3, 0x0

    .line 40
    :goto_1
    iget-boolean v4, p0, Lmz5;->h0:Z

    .line 41
    .line 42
    iput-boolean v4, v0, Lnz5;->g0:Z

    .line 43
    .line 44
    and-int/lit8 v4, v1, 0x4

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    if-ne v4, v5, :cond_2

    .line 48
    .line 49
    or-int/lit8 v3, v3, 0x2

    .line 50
    .line 51
    :cond_2
    iget v4, p0, Lmz5;->i0:I

    .line 52
    .line 53
    iput v4, v0, Lnz5;->h0:I

    .line 54
    .line 55
    and-int/lit8 v4, v1, 0x8

    .line 56
    .line 57
    const/16 v5, 0x8

    .line 58
    .line 59
    if-ne v4, v5, :cond_3

    .line 60
    .line 61
    or-int/lit8 v3, v3, 0x4

    .line 62
    .line 63
    :cond_3
    iget-object v4, p0, Lmz5;->j0:Lnz5;

    .line 64
    .line 65
    iput-object v4, v0, Lnz5;->i0:Lnz5;

    .line 66
    .line 67
    and-int/lit8 v4, v1, 0x10

    .line 68
    .line 69
    const/16 v5, 0x10

    .line 70
    .line 71
    if-ne v4, v5, :cond_4

    .line 72
    .line 73
    or-int/lit8 v3, v3, 0x8

    .line 74
    .line 75
    :cond_4
    iget v4, p0, Lmz5;->k0:I

    .line 76
    .line 77
    iput v4, v0, Lnz5;->j0:I

    .line 78
    .line 79
    and-int/lit8 v4, v1, 0x20

    .line 80
    .line 81
    const/16 v5, 0x20

    .line 82
    .line 83
    if-ne v4, v5, :cond_5

    .line 84
    .line 85
    or-int/lit8 v3, v3, 0x10

    .line 86
    .line 87
    :cond_5
    iget v4, p0, Lmz5;->l0:I

    .line 88
    .line 89
    iput v4, v0, Lnz5;->k0:I

    .line 90
    .line 91
    and-int/lit8 v4, v1, 0x40

    .line 92
    .line 93
    const/16 v5, 0x40

    .line 94
    .line 95
    if-ne v4, v5, :cond_6

    .line 96
    .line 97
    or-int/lit8 v3, v3, 0x20

    .line 98
    .line 99
    :cond_6
    iget v4, p0, Lmz5;->m0:I

    .line 100
    .line 101
    iput v4, v0, Lnz5;->l0:I

    .line 102
    .line 103
    and-int/lit16 v4, v1, 0x80

    .line 104
    .line 105
    const/16 v5, 0x80

    .line 106
    .line 107
    if-ne v4, v5, :cond_7

    .line 108
    .line 109
    or-int/lit8 v3, v3, 0x40

    .line 110
    .line 111
    :cond_7
    iget v4, p0, Lmz5;->n0:I

    .line 112
    .line 113
    iput v4, v0, Lnz5;->m0:I

    .line 114
    .line 115
    and-int/lit16 v4, v1, 0x100

    .line 116
    .line 117
    const/16 v5, 0x100

    .line 118
    .line 119
    if-ne v4, v5, :cond_8

    .line 120
    .line 121
    or-int/lit16 v3, v3, 0x80

    .line 122
    .line 123
    :cond_8
    iget v4, p0, Lmz5;->o0:I

    .line 124
    .line 125
    iput v4, v0, Lnz5;->n0:I

    .line 126
    .line 127
    and-int/lit16 v4, v1, 0x200

    .line 128
    .line 129
    const/16 v5, 0x200

    .line 130
    .line 131
    if-ne v4, v5, :cond_9

    .line 132
    .line 133
    or-int/lit16 v3, v3, 0x100

    .line 134
    .line 135
    :cond_9
    iget-object v4, p0, Lmz5;->p0:Lnz5;

    .line 136
    .line 137
    iput-object v4, v0, Lnz5;->o0:Lnz5;

    .line 138
    .line 139
    and-int/lit16 v4, v1, 0x400

    .line 140
    .line 141
    const/16 v5, 0x400

    .line 142
    .line 143
    if-ne v4, v5, :cond_a

    .line 144
    .line 145
    or-int/lit16 v3, v3, 0x200

    .line 146
    .line 147
    :cond_a
    iget v4, p0, Lmz5;->q0:I

    .line 148
    .line 149
    iput v4, v0, Lnz5;->p0:I

    .line 150
    .line 151
    and-int/lit16 v4, v1, 0x800

    .line 152
    .line 153
    const/16 v5, 0x800

    .line 154
    .line 155
    if-ne v4, v5, :cond_b

    .line 156
    .line 157
    or-int/lit16 v3, v3, 0x400

    .line 158
    .line 159
    :cond_b
    iget-object v4, p0, Lmz5;->r0:Lnz5;

    .line 160
    .line 161
    iput-object v4, v0, Lnz5;->q0:Lnz5;

    .line 162
    .line 163
    and-int/lit16 v4, v1, 0x1000

    .line 164
    .line 165
    const/16 v5, 0x1000

    .line 166
    .line 167
    if-ne v4, v5, :cond_c

    .line 168
    .line 169
    or-int/lit16 v3, v3, 0x800

    .line 170
    .line 171
    :cond_c
    iget v4, p0, Lmz5;->s0:I

    .line 172
    .line 173
    iput v4, v0, Lnz5;->r0:I

    .line 174
    .line 175
    const/16 v4, 0x2000

    .line 176
    .line 177
    and-int/2addr v1, v4

    .line 178
    if-ne v1, v4, :cond_d

    .line 179
    .line 180
    or-int/lit16 v3, v3, 0x1000

    .line 181
    .line 182
    :cond_d
    iget v1, p0, Lmz5;->t0:I

    .line 183
    .line 184
    iput v1, v0, Lnz5;->s0:I

    .line 185
    .line 186
    const/16 v1, 0x4000

    .line 187
    .line 188
    and-int/2addr v2, v1

    .line 189
    if-ne v2, v1, :cond_e

    .line 190
    .line 191
    iget-object v1, p0, Lmz5;->u0:Ljava/util/List;

    .line 192
    .line 193
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, p0, Lmz5;->u0:Ljava/util/List;

    .line 198
    .line 199
    iget v1, p0, Lmz5;->f0:I

    .line 200
    .line 201
    and-int/lit16 v1, v1, -0x4001

    .line 202
    .line 203
    iput v1, p0, Lmz5;->f0:I

    .line 204
    .line 205
    :cond_e
    iget-object p0, p0, Lmz5;->u0:Ljava/util/List;

    .line 206
    .line 207
    iput-object p0, v0, Lnz5;->t0:Ljava/util/List;

    .line 208
    .line 209
    iput v3, v0, Lnz5;->Z:I

    .line 210
    .line 211
    return-object v0
.end method

.method public final i(Lnz5;)Lmz5;
    .locals 5

    .line 1
    sget-object v0, Lnz5;->w0:Lnz5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v1, p1, Lnz5;->f0:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    iget-object v1, p0, Lmz5;->g0:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p1, Lnz5;->f0:Ljava/util/List;

    .line 24
    .line 25
    iput-object v1, p0, Lmz5;->g0:Ljava/util/List;

    .line 26
    .line 27
    iget v1, p0, Lmz5;->f0:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, -0x2

    .line 30
    .line 31
    iput v1, p0, Lmz5;->f0:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v1, p0, Lmz5;->f0:I

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v3, p0, Lmz5;->g0:Ljava/util/List;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lmz5;->g0:Ljava/util/List;

    .line 47
    .line 48
    iget v1, p0, Lmz5;->f0:I

    .line 49
    .line 50
    or-int/2addr v1, v2

    .line 51
    iput v1, p0, Lmz5;->f0:I

    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, Lmz5;->g0:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lnz5;->f0:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    iget v1, p1, Lnz5;->Z:I

    .line 61
    .line 62
    and-int/lit8 v3, v1, 0x1

    .line 63
    .line 64
    const/4 v4, 0x2

    .line 65
    if-ne v3, v2, :cond_4

    .line 66
    .line 67
    iget-boolean v2, p1, Lnz5;->g0:Z

    .line 68
    .line 69
    iget v3, p0, Lmz5;->f0:I

    .line 70
    .line 71
    or-int/2addr v3, v4

    .line 72
    iput v3, p0, Lmz5;->f0:I

    .line 73
    .line 74
    iput-boolean v2, p0, Lmz5;->h0:Z

    .line 75
    .line 76
    :cond_4
    and-int/lit8 v2, v1, 0x2

    .line 77
    .line 78
    const/4 v3, 0x4

    .line 79
    if-ne v2, v4, :cond_5

    .line 80
    .line 81
    iget v2, p1, Lnz5;->h0:I

    .line 82
    .line 83
    iget v4, p0, Lmz5;->f0:I

    .line 84
    .line 85
    or-int/2addr v4, v3

    .line 86
    iput v4, p0, Lmz5;->f0:I

    .line 87
    .line 88
    iput v2, p0, Lmz5;->i0:I

    .line 89
    .line 90
    :cond_5
    and-int/2addr v1, v3

    .line 91
    const/16 v2, 0x8

    .line 92
    .line 93
    if-ne v1, v3, :cond_7

    .line 94
    .line 95
    iget-object v1, p1, Lnz5;->i0:Lnz5;

    .line 96
    .line 97
    iget v3, p0, Lmz5;->f0:I

    .line 98
    .line 99
    and-int/2addr v3, v2

    .line 100
    if-ne v3, v2, :cond_6

    .line 101
    .line 102
    iget-object v3, p0, Lmz5;->j0:Lnz5;

    .line 103
    .line 104
    if-eq v3, v0, :cond_6

    .line 105
    .line 106
    invoke-static {v3}, Lnz5;->r(Lnz5;)Lmz5;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3, v1}, Lmz5;->i(Lnz5;)Lmz5;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Lmz5;->g()Lnz5;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, p0, Lmz5;->j0:Lnz5;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    iput-object v1, p0, Lmz5;->j0:Lnz5;

    .line 121
    .line 122
    :goto_1
    iget v1, p0, Lmz5;->f0:I

    .line 123
    .line 124
    or-int/2addr v1, v2

    .line 125
    iput v1, p0, Lmz5;->f0:I

    .line 126
    .line 127
    :cond_7
    iget v1, p1, Lnz5;->Z:I

    .line 128
    .line 129
    and-int/2addr v1, v2

    .line 130
    if-ne v1, v2, :cond_8

    .line 131
    .line 132
    iget v1, p1, Lnz5;->j0:I

    .line 133
    .line 134
    iget v2, p0, Lmz5;->f0:I

    .line 135
    .line 136
    or-int/lit8 v2, v2, 0x10

    .line 137
    .line 138
    iput v2, p0, Lmz5;->f0:I

    .line 139
    .line 140
    iput v1, p0, Lmz5;->k0:I

    .line 141
    .line 142
    :cond_8
    invoke-virtual {p1}, Lnz5;->p()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const/16 v2, 0x20

    .line 147
    .line 148
    if-eqz v1, :cond_9

    .line 149
    .line 150
    iget v1, p1, Lnz5;->k0:I

    .line 151
    .line 152
    iget v3, p0, Lmz5;->f0:I

    .line 153
    .line 154
    or-int/2addr v3, v2

    .line 155
    iput v3, p0, Lmz5;->f0:I

    .line 156
    .line 157
    iput v1, p0, Lmz5;->l0:I

    .line 158
    .line 159
    :cond_9
    iget v1, p1, Lnz5;->Z:I

    .line 160
    .line 161
    and-int/lit8 v3, v1, 0x20

    .line 162
    .line 163
    const/16 v4, 0x40

    .line 164
    .line 165
    if-ne v3, v2, :cond_a

    .line 166
    .line 167
    iget v2, p1, Lnz5;->l0:I

    .line 168
    .line 169
    iget v3, p0, Lmz5;->f0:I

    .line 170
    .line 171
    or-int/2addr v3, v4

    .line 172
    iput v3, p0, Lmz5;->f0:I

    .line 173
    .line 174
    iput v2, p0, Lmz5;->m0:I

    .line 175
    .line 176
    :cond_a
    and-int/lit8 v2, v1, 0x40

    .line 177
    .line 178
    const/16 v3, 0x80

    .line 179
    .line 180
    if-ne v2, v4, :cond_b

    .line 181
    .line 182
    iget v2, p1, Lnz5;->m0:I

    .line 183
    .line 184
    iget v4, p0, Lmz5;->f0:I

    .line 185
    .line 186
    or-int/2addr v4, v3

    .line 187
    iput v4, p0, Lmz5;->f0:I

    .line 188
    .line 189
    iput v2, p0, Lmz5;->n0:I

    .line 190
    .line 191
    :cond_b
    and-int/lit16 v2, v1, 0x80

    .line 192
    .line 193
    const/16 v4, 0x100

    .line 194
    .line 195
    if-ne v2, v3, :cond_c

    .line 196
    .line 197
    iget v2, p1, Lnz5;->n0:I

    .line 198
    .line 199
    iget v3, p0, Lmz5;->f0:I

    .line 200
    .line 201
    or-int/2addr v3, v4

    .line 202
    iput v3, p0, Lmz5;->f0:I

    .line 203
    .line 204
    iput v2, p0, Lmz5;->o0:I

    .line 205
    .line 206
    :cond_c
    and-int/2addr v1, v4

    .line 207
    const/16 v2, 0x200

    .line 208
    .line 209
    if-ne v1, v4, :cond_e

    .line 210
    .line 211
    iget-object v1, p1, Lnz5;->o0:Lnz5;

    .line 212
    .line 213
    iget v3, p0, Lmz5;->f0:I

    .line 214
    .line 215
    and-int/2addr v3, v2

    .line 216
    if-ne v3, v2, :cond_d

    .line 217
    .line 218
    iget-object v3, p0, Lmz5;->p0:Lnz5;

    .line 219
    .line 220
    if-eq v3, v0, :cond_d

    .line 221
    .line 222
    invoke-static {v3}, Lnz5;->r(Lnz5;)Lmz5;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v3, v1}, Lmz5;->i(Lnz5;)Lmz5;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, Lmz5;->g()Lnz5;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iput-object v1, p0, Lmz5;->p0:Lnz5;

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_d
    iput-object v1, p0, Lmz5;->p0:Lnz5;

    .line 237
    .line 238
    :goto_2
    iget v1, p0, Lmz5;->f0:I

    .line 239
    .line 240
    or-int/2addr v1, v2

    .line 241
    iput v1, p0, Lmz5;->f0:I

    .line 242
    .line 243
    :cond_e
    iget v1, p1, Lnz5;->Z:I

    .line 244
    .line 245
    and-int/lit16 v3, v1, 0x200

    .line 246
    .line 247
    const/16 v4, 0x400

    .line 248
    .line 249
    if-ne v3, v2, :cond_f

    .line 250
    .line 251
    iget v2, p1, Lnz5;->p0:I

    .line 252
    .line 253
    iget v3, p0, Lmz5;->f0:I

    .line 254
    .line 255
    or-int/2addr v3, v4

    .line 256
    iput v3, p0, Lmz5;->f0:I

    .line 257
    .line 258
    iput v2, p0, Lmz5;->q0:I

    .line 259
    .line 260
    :cond_f
    and-int/2addr v1, v4

    .line 261
    const/16 v2, 0x800

    .line 262
    .line 263
    if-ne v1, v4, :cond_11

    .line 264
    .line 265
    iget-object v1, p1, Lnz5;->q0:Lnz5;

    .line 266
    .line 267
    iget v3, p0, Lmz5;->f0:I

    .line 268
    .line 269
    and-int/2addr v3, v2

    .line 270
    if-ne v3, v2, :cond_10

    .line 271
    .line 272
    iget-object v3, p0, Lmz5;->r0:Lnz5;

    .line 273
    .line 274
    if-eq v3, v0, :cond_10

    .line 275
    .line 276
    invoke-static {v3}, Lnz5;->r(Lnz5;)Lmz5;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0, v1}, Lmz5;->i(Lnz5;)Lmz5;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lmz5;->g()Lnz5;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iput-object v0, p0, Lmz5;->r0:Lnz5;

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_10
    iput-object v1, p0, Lmz5;->r0:Lnz5;

    .line 291
    .line 292
    :goto_3
    iget v0, p0, Lmz5;->f0:I

    .line 293
    .line 294
    or-int/2addr v0, v2

    .line 295
    iput v0, p0, Lmz5;->f0:I

    .line 296
    .line 297
    :cond_11
    iget v0, p1, Lnz5;->Z:I

    .line 298
    .line 299
    and-int/lit16 v1, v0, 0x800

    .line 300
    .line 301
    const/16 v3, 0x1000

    .line 302
    .line 303
    if-ne v1, v2, :cond_12

    .line 304
    .line 305
    iget v1, p1, Lnz5;->r0:I

    .line 306
    .line 307
    iget v2, p0, Lmz5;->f0:I

    .line 308
    .line 309
    or-int/2addr v2, v3

    .line 310
    iput v2, p0, Lmz5;->f0:I

    .line 311
    .line 312
    iput v1, p0, Lmz5;->s0:I

    .line 313
    .line 314
    :cond_12
    and-int/2addr v0, v3

    .line 315
    if-ne v0, v3, :cond_13

    .line 316
    .line 317
    iget v0, p1, Lnz5;->s0:I

    .line 318
    .line 319
    iget v1, p0, Lmz5;->f0:I

    .line 320
    .line 321
    or-int/lit16 v1, v1, 0x2000

    .line 322
    .line 323
    iput v1, p0, Lmz5;->f0:I

    .line 324
    .line 325
    iput v0, p0, Lmz5;->t0:I

    .line 326
    .line 327
    :cond_13
    iget-object v0, p1, Lnz5;->t0:Ljava/util/List;

    .line 328
    .line 329
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_16

    .line 334
    .line 335
    iget-object v0, p0, Lmz5;->u0:Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_14

    .line 342
    .line 343
    iget-object v0, p1, Lnz5;->t0:Ljava/util/List;

    .line 344
    .line 345
    iput-object v0, p0, Lmz5;->u0:Ljava/util/List;

    .line 346
    .line 347
    iget v0, p0, Lmz5;->f0:I

    .line 348
    .line 349
    and-int/lit16 v0, v0, -0x4001

    .line 350
    .line 351
    iput v0, p0, Lmz5;->f0:I

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_14
    iget v0, p0, Lmz5;->f0:I

    .line 355
    .line 356
    const/16 v1, 0x4000

    .line 357
    .line 358
    and-int/2addr v0, v1

    .line 359
    if-eq v0, v1, :cond_15

    .line 360
    .line 361
    new-instance v0, Ljava/util/ArrayList;

    .line 362
    .line 363
    iget-object v2, p0, Lmz5;->u0:Ljava/util/List;

    .line 364
    .line 365
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 366
    .line 367
    .line 368
    iput-object v0, p0, Lmz5;->u0:Ljava/util/List;

    .line 369
    .line 370
    iget v0, p0, Lmz5;->f0:I

    .line 371
    .line 372
    or-int/2addr v0, v1

    .line 373
    iput v0, p0, Lmz5;->f0:I

    .line 374
    .line 375
    :cond_15
    iget-object v0, p0, Lmz5;->u0:Ljava/util/List;

    .line 376
    .line 377
    iget-object v1, p1, Lnz5;->t0:Ljava/util/List;

    .line 378
    .line 379
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 380
    .line 381
    .line 382
    :cond_16
    :goto_4
    invoke-virtual {p0, p1}, Lxp2;->f(Lyp2;)V

    .line 383
    .line 384
    .line 385
    iget-object v0, p0, Lup2;->X:Ljb0;

    .line 386
    .line 387
    iget-object p1, p1, Lnz5;->Y:Ljb0;

    .line 388
    .line 389
    invoke-virtual {v0, p1}, Ljb0;->b(Ljb0;)Ljb0;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    iput-object p1, p0, Lup2;->X:Ljb0;

    .line 394
    .line 395
    return-object p0
.end method
