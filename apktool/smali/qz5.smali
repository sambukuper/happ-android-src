.class public final Lqz5;
.super Lxp2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:Z

.field public j0:Lrz5;

.field public k0:Ljava/util/List;

.field public l0:Ljava/util/List;

.field public m0:Ljava/util/List;


# direct methods
.method public static h()Lqz5;
    .locals 2

    .line 1
    new-instance v0, Lqz5;

    .line 2
    .line 3
    invoke-direct {v0}, Lxp2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lrz5;->f0:Lrz5;

    .line 7
    .line 8
    iput-object v1, v0, Lqz5;->j0:Lrz5;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    iput-object v1, v0, Lqz5;->k0:Ljava/util/List;

    .line 13
    .line 14
    iput-object v1, v0, Lqz5;->l0:Ljava/util/List;

    .line 15
    .line 16
    iput-object v1, v0, Lqz5;->m0:Ljava/util/List;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final b()Ld2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqz5;->g()Lsz5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lsz5;->d()Z

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
    sget-object v1, Lsz5;->q0:Lau3;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Lsz5;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2}, Lsz5;-><init>(Liv0;Lr62;)V
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lqz5;->i(Lsz5;)V

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
    check-cast p2, Lsz5;
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
    invoke-virtual {p0, v0}, Lqz5;->i(Lsz5;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lqz5;->h()Lqz5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lqz5;->g()Lsz5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lqz5;->i(Lsz5;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic e(Lbq2;)Lup2;
    .locals 0

    .line 1
    check-cast p1, Lsz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lqz5;->i(Lsz5;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g()Lsz5;
    .locals 5

    .line 1
    new-instance v0, Lsz5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lsz5;-><init>(Lqz5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lqz5;->f0:I

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
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget v2, p0, Lqz5;->g0:I

    .line 16
    .line 17
    iput v2, v0, Lsz5;->f0:I

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-ne v2, v4, :cond_1

    .line 23
    .line 24
    or-int/lit8 v3, v3, 0x2

    .line 25
    .line 26
    :cond_1
    iget v2, p0, Lqz5;->h0:I

    .line 27
    .line 28
    iput v2, v0, Lsz5;->g0:I

    .line 29
    .line 30
    and-int/lit8 v2, v1, 0x4

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    if-ne v2, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x4

    .line 36
    .line 37
    :cond_2
    iget-boolean v2, p0, Lqz5;->i0:Z

    .line 38
    .line 39
    iput-boolean v2, v0, Lsz5;->h0:Z

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x8

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    if-ne v2, v4, :cond_3

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x8

    .line 48
    .line 49
    :cond_3
    iget-object v2, p0, Lqz5;->j0:Lrz5;

    .line 50
    .line 51
    iput-object v2, v0, Lsz5;->i0:Lrz5;

    .line 52
    .line 53
    and-int/lit8 v2, v1, 0x10

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v2, v4, :cond_4

    .line 58
    .line 59
    iget-object v1, p0, Lqz5;->k0:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lqz5;->k0:Ljava/util/List;

    .line 66
    .line 67
    iget v1, p0, Lqz5;->f0:I

    .line 68
    .line 69
    and-int/lit8 v1, v1, -0x11

    .line 70
    .line 71
    iput v1, p0, Lqz5;->f0:I

    .line 72
    .line 73
    :cond_4
    iget-object v2, p0, Lqz5;->k0:Ljava/util/List;

    .line 74
    .line 75
    iput-object v2, v0, Lsz5;->j0:Ljava/util/List;

    .line 76
    .line 77
    and-int/lit8 v2, v1, 0x20

    .line 78
    .line 79
    const/16 v4, 0x20

    .line 80
    .line 81
    if-ne v2, v4, :cond_5

    .line 82
    .line 83
    iget-object v1, p0, Lqz5;->l0:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, p0, Lqz5;->l0:Ljava/util/List;

    .line 90
    .line 91
    iget v1, p0, Lqz5;->f0:I

    .line 92
    .line 93
    and-int/lit8 v1, v1, -0x21

    .line 94
    .line 95
    iput v1, p0, Lqz5;->f0:I

    .line 96
    .line 97
    :cond_5
    iget-object v2, p0, Lqz5;->l0:Ljava/util/List;

    .line 98
    .line 99
    iput-object v2, v0, Lsz5;->k0:Ljava/util/List;

    .line 100
    .line 101
    const/16 v2, 0x40

    .line 102
    .line 103
    and-int/2addr v1, v2

    .line 104
    if-ne v1, v2, :cond_6

    .line 105
    .line 106
    iget-object v1, p0, Lqz5;->m0:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, Lqz5;->m0:Ljava/util/List;

    .line 113
    .line 114
    iget v1, p0, Lqz5;->f0:I

    .line 115
    .line 116
    and-int/lit8 v1, v1, -0x41

    .line 117
    .line 118
    iput v1, p0, Lqz5;->f0:I

    .line 119
    .line 120
    :cond_6
    iget-object p0, p0, Lqz5;->m0:Ljava/util/List;

    .line 121
    .line 122
    iput-object p0, v0, Lsz5;->m0:Ljava/util/List;

    .line 123
    .line 124
    iput v3, v0, Lsz5;->Z:I

    .line 125
    .line 126
    return-object v0
.end method

.method public final i(Lsz5;)V
    .locals 4

    .line 1
    sget-object v0, Lsz5;->p0:Lsz5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lsz5;->Z:I

    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget v1, p1, Lsz5;->f0:I

    .line 14
    .line 15
    iget v3, p0, Lqz5;->f0:I

    .line 16
    .line 17
    or-int/2addr v2, v3

    .line 18
    iput v2, p0, Lqz5;->f0:I

    .line 19
    .line 20
    iput v1, p0, Lqz5;->g0:I

    .line 21
    .line 22
    :cond_1
    and-int/lit8 v1, v0, 0x2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p1, Lsz5;->g0:I

    .line 28
    .line 29
    iget v3, p0, Lqz5;->f0:I

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    iput v2, p0, Lqz5;->f0:I

    .line 33
    .line 34
    iput v1, p0, Lqz5;->h0:I

    .line 35
    .line 36
    :cond_2
    and-int/lit8 v1, v0, 0x4

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    iget-boolean v1, p1, Lsz5;->h0:Z

    .line 42
    .line 43
    iget v3, p0, Lqz5;->f0:I

    .line 44
    .line 45
    or-int/2addr v2, v3

    .line 46
    iput v2, p0, Lqz5;->f0:I

    .line 47
    .line 48
    iput-boolean v1, p0, Lqz5;->i0:Z

    .line 49
    .line 50
    :cond_3
    const/16 v1, 0x8

    .line 51
    .line 52
    and-int/2addr v0, v1

    .line 53
    if-ne v0, v1, :cond_4

    .line 54
    .line 55
    iget-object v0, p1, Lsz5;->i0:Lrz5;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget v2, p0, Lqz5;->f0:I

    .line 61
    .line 62
    or-int/2addr v1, v2

    .line 63
    iput v1, p0, Lqz5;->f0:I

    .line 64
    .line 65
    iput-object v0, p0, Lqz5;->j0:Lrz5;

    .line 66
    .line 67
    :cond_4
    iget-object v0, p1, Lsz5;->j0:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    iget-object v0, p0, Lqz5;->k0:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    iget-object v0, p1, Lsz5;->j0:Ljava/util/List;

    .line 84
    .line 85
    iput-object v0, p0, Lqz5;->k0:Ljava/util/List;

    .line 86
    .line 87
    iget v0, p0, Lqz5;->f0:I

    .line 88
    .line 89
    and-int/lit8 v0, v0, -0x11

    .line 90
    .line 91
    iput v0, p0, Lqz5;->f0:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    iget v0, p0, Lqz5;->f0:I

    .line 95
    .line 96
    const/16 v1, 0x10

    .line 97
    .line 98
    and-int/2addr v0, v1

    .line 99
    if-eq v0, v1, :cond_6

    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object v2, p0, Lqz5;->k0:Ljava/util/List;

    .line 104
    .line 105
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lqz5;->k0:Ljava/util/List;

    .line 109
    .line 110
    iget v0, p0, Lqz5;->f0:I

    .line 111
    .line 112
    or-int/2addr v0, v1

    .line 113
    iput v0, p0, Lqz5;->f0:I

    .line 114
    .line 115
    :cond_6
    iget-object v0, p0, Lqz5;->k0:Ljava/util/List;

    .line 116
    .line 117
    iget-object v1, p1, Lsz5;->j0:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 120
    .line 121
    .line 122
    :cond_7
    :goto_0
    iget-object v0, p1, Lsz5;->k0:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_a

    .line 129
    .line 130
    iget-object v0, p0, Lqz5;->l0:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    iget-object v0, p1, Lsz5;->k0:Ljava/util/List;

    .line 139
    .line 140
    iput-object v0, p0, Lqz5;->l0:Ljava/util/List;

    .line 141
    .line 142
    iget v0, p0, Lqz5;->f0:I

    .line 143
    .line 144
    and-int/lit8 v0, v0, -0x21

    .line 145
    .line 146
    iput v0, p0, Lqz5;->f0:I

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_8
    iget v0, p0, Lqz5;->f0:I

    .line 150
    .line 151
    const/16 v1, 0x20

    .line 152
    .line 153
    and-int/2addr v0, v1

    .line 154
    if-eq v0, v1, :cond_9

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    iget-object v2, p0, Lqz5;->l0:Ljava/util/List;

    .line 159
    .line 160
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    .line 162
    .line 163
    iput-object v0, p0, Lqz5;->l0:Ljava/util/List;

    .line 164
    .line 165
    iget v0, p0, Lqz5;->f0:I

    .line 166
    .line 167
    or-int/2addr v0, v1

    .line 168
    iput v0, p0, Lqz5;->f0:I

    .line 169
    .line 170
    :cond_9
    iget-object v0, p0, Lqz5;->l0:Ljava/util/List;

    .line 171
    .line 172
    iget-object v1, p1, Lsz5;->k0:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    :cond_a
    :goto_1
    iget-object v0, p1, Lsz5;->m0:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_d

    .line 184
    .line 185
    iget-object v0, p0, Lqz5;->m0:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_b

    .line 192
    .line 193
    iget-object v0, p1, Lsz5;->m0:Ljava/util/List;

    .line 194
    .line 195
    iput-object v0, p0, Lqz5;->m0:Ljava/util/List;

    .line 196
    .line 197
    iget v0, p0, Lqz5;->f0:I

    .line 198
    .line 199
    and-int/lit8 v0, v0, -0x41

    .line 200
    .line 201
    iput v0, p0, Lqz5;->f0:I

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_b
    iget v0, p0, Lqz5;->f0:I

    .line 205
    .line 206
    const/16 v1, 0x40

    .line 207
    .line 208
    and-int/2addr v0, v1

    .line 209
    if-eq v0, v1, :cond_c

    .line 210
    .line 211
    new-instance v0, Ljava/util/ArrayList;

    .line 212
    .line 213
    iget-object v2, p0, Lqz5;->m0:Ljava/util/List;

    .line 214
    .line 215
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 216
    .line 217
    .line 218
    iput-object v0, p0, Lqz5;->m0:Ljava/util/List;

    .line 219
    .line 220
    iget v0, p0, Lqz5;->f0:I

    .line 221
    .line 222
    or-int/2addr v0, v1

    .line 223
    iput v0, p0, Lqz5;->f0:I

    .line 224
    .line 225
    :cond_c
    iget-object v0, p0, Lqz5;->m0:Ljava/util/List;

    .line 226
    .line 227
    iget-object v1, p1, Lsz5;->m0:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 230
    .line 231
    .line 232
    :cond_d
    :goto_2
    invoke-virtual {p0, p1}, Lxp2;->f(Lyp2;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, Lup2;->X:Ljb0;

    .line 236
    .line 237
    iget-object p1, p1, Lsz5;->Y:Ljb0;

    .line 238
    .line 239
    invoke-virtual {v0, p1}, Ljb0;->b(Ljb0;)Ljb0;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iput-object p1, p0, Lup2;->X:Ljb0;

    .line 244
    .line 245
    return-void
.end method
