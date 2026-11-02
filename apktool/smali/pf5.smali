.class public final Lpf5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ll37;

.field public final b:Lce1;

.field public final c:Ldh8;

.field public final d:Lal;

.field public final e:Lhz8;

.field public final f:Lm85;

.field public final g:Z

.field public final h:Z

.field public i:Z

.field public j:Ljava/util/LinkedHashMap;

.field public k:Ljava/util/List;

.field public l:Lo8;

.field public m:Ljava/util/LinkedList;

.field public n:Ljava/util/LinkedList;

.field public o:Ljava/util/LinkedList;

.field public p:Ljava/util/LinkedList;

.field public q:Ljava/util/LinkedList;

.field public r:Ljava/util/LinkedList;

.field public s:Ljava/util/LinkedHashMap;

.field public t:Lno3;


# direct methods
.method public constructor <init>(Ll37;Ldh8;Lal;Lce1;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpf5;->a:Ll37;

    .line 5
    .line 6
    iput-object p2, p0, Lpf5;->c:Ldh8;

    .line 7
    .line 8
    iput-object p3, p0, Lpf5;->d:Lal;

    .line 9
    .line 10
    iget-object v0, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {v0}, Lit0;->t(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lpf5;->h:Z

    .line 17
    .line 18
    sget-object v0, Lxp4;->Z:Lxp4;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lpf5;->g:Z

    .line 28
    .line 29
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lpf5;->f:Lm85;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lpf5;->g:Z

    .line 38
    .line 39
    sget-object v0, Lz55;->X:Lz55;

    .line 40
    .line 41
    iput-object v0, p0, Lpf5;->f:Lm85;

    .line 42
    .line 43
    :goto_0
    iget-object p2, p2, Ldh8;->j0:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {p2}, Lit0;->q(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    sget-object p2, Lhz8;->i0:Lhz8;

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    iget-wide v0, p1, Lvp4;->X:J

    .line 56
    .line 57
    sget-wide v2, Lwp4;->l0:J

    .line 58
    .line 59
    and-long/2addr v0, v2

    .line 60
    cmp-long v0, v0, v2

    .line 61
    .line 62
    sget-object v4, Lhn3;->X:Lhn3;

    .line 63
    .line 64
    sget-object v1, Lhz8;->h0:Lhz8;

    .line 65
    .line 66
    if-eqz v0, :cond_a

    .line 67
    .line 68
    sget-object v0, Lxp4;->h0:Lxp4;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sget-object v6, Lhn3;->Z:Lhn3;

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    new-instance v1, Lhz8;

    .line 79
    .line 80
    sget-object v2, Lhn3;->Y:Lhn3;

    .line 81
    .line 82
    move-object v3, v2

    .line 83
    move-object v5, v4

    .line 84
    invoke-direct/range {v1 .. v6}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object v0, Lxp4;->i0:Lxp4;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    iget-object v0, v1, Lhz8;->X:Lhn3;

    .line 96
    .line 97
    if-ne v0, v6, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    new-instance v5, Lhz8;

    .line 101
    .line 102
    iget-object v7, v1, Lhz8;->Y:Lhn3;

    .line 103
    .line 104
    iget-object v8, v1, Lhz8;->Z:Lhn3;

    .line 105
    .line 106
    iget-object v9, v1, Lhz8;->f0:Lhn3;

    .line 107
    .line 108
    iget-object v10, v1, Lhz8;->g0:Lhn3;

    .line 109
    .line 110
    invoke-direct/range {v5 .. v10}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v5

    .line 114
    :cond_4
    :goto_1
    sget-object v0, Lxp4;->j0:Lxp4;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_6

    .line 121
    .line 122
    iget-object v0, v1, Lhz8;->Y:Lhn3;

    .line 123
    .line 124
    if-ne v0, v6, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    new-instance v5, Lhz8;

    .line 128
    .line 129
    move-object v7, v6

    .line 130
    iget-object v6, v1, Lhz8;->X:Lhn3;

    .line 131
    .line 132
    iget-object v8, v1, Lhz8;->Z:Lhn3;

    .line 133
    .line 134
    iget-object v9, v1, Lhz8;->f0:Lhn3;

    .line 135
    .line 136
    iget-object v10, v1, Lhz8;->g0:Lhn3;

    .line 137
    .line 138
    invoke-direct/range {v5 .. v10}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 139
    .line 140
    .line 141
    move-object v6, v7

    .line 142
    move-object v1, v5

    .line 143
    :cond_6
    :goto_2
    sget-object v0, Lxp4;->k0:Lxp4;

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_8

    .line 150
    .line 151
    iget-object v0, v1, Lhz8;->Z:Lhn3;

    .line 152
    .line 153
    if-ne v0, v6, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    new-instance v5, Lhz8;

    .line 157
    .line 158
    move-object v7, v6

    .line 159
    iget-object v6, v1, Lhz8;->X:Lhn3;

    .line 160
    .line 161
    move-object v8, v7

    .line 162
    iget-object v7, v1, Lhz8;->Y:Lhn3;

    .line 163
    .line 164
    iget-object v9, v1, Lhz8;->f0:Lhn3;

    .line 165
    .line 166
    iget-object v10, v1, Lhz8;->g0:Lhn3;

    .line 167
    .line 168
    invoke-direct/range {v5 .. v10}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 169
    .line 170
    .line 171
    move-object v6, v8

    .line 172
    move-object v1, v5

    .line 173
    :cond_8
    :goto_3
    sget-object v0, Lxp4;->g0:Lxp4;

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_a

    .line 180
    .line 181
    iget-object v0, v1, Lhz8;->f0:Lhn3;

    .line 182
    .line 183
    if-ne v0, v6, :cond_9

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_9
    new-instance v5, Lhz8;

    .line 187
    .line 188
    move-object v7, v6

    .line 189
    iget-object v6, v1, Lhz8;->X:Lhn3;

    .line 190
    .line 191
    move-object v8, v7

    .line 192
    iget-object v7, v1, Lhz8;->Y:Lhn3;

    .line 193
    .line 194
    move-object v9, v8

    .line 195
    iget-object v8, v1, Lhz8;->Z:Lhn3;

    .line 196
    .line 197
    iget-object v10, v1, Lhz8;->g0:Lhn3;

    .line 198
    .line 199
    invoke-direct/range {v5 .. v10}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 200
    .line 201
    .line 202
    move-object v1, v5

    .line 203
    :cond_a
    :goto_4
    invoke-static {p2}, Lit0;->t(Ljava/lang/Class;)Z

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    if-eqz p2, :cond_b

    .line 208
    .line 209
    sget-object p2, Lxp4;->g0:Lxp4;

    .line 210
    .line 211
    invoke-virtual {p1, p2}, Lvp4;->f(Lxp4;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_b

    .line 216
    .line 217
    iget-object p2, v1, Lhz8;->f0:Lhn3;

    .line 218
    .line 219
    if-ne p2, v4, :cond_c

    .line 220
    .line 221
    :cond_b
    :goto_5
    move-object p2, v1

    .line 222
    goto :goto_6

    .line 223
    :cond_c
    move-object p2, v1

    .line 224
    new-instance v1, Lhz8;

    .line 225
    .line 226
    iget-object v2, p2, Lhz8;->X:Lhn3;

    .line 227
    .line 228
    iget-object v3, p2, Lhz8;->Y:Lhn3;

    .line 229
    .line 230
    move-object v5, v4

    .line 231
    iget-object v4, p2, Lhz8;->Z:Lhn3;

    .line 232
    .line 233
    iget-object v6, p2, Lhz8;->g0:Lhn3;

    .line 234
    .line 235
    invoke-direct/range {v1 .. v6}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :goto_6
    invoke-virtual {p1}, Lvp4;->d()Lm85;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p1, p3, p2}, Lm85;->b(Lal;Lhz8;)Lhz8;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    iput-object p1, p0, Lpf5;->e:Lhz8;

    .line 248
    .line 249
    iput-object p4, p0, Lpf5;->b:Lce1;

    .line 250
    .line 251
    return-void
.end method

.method public static g(Ljava/util/LinkedList;)Z
    .locals 5

    .line 1
    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, Lgl;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lgl;

    .line 14
    .line 15
    instance-of v4, v1, Lel;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    instance-of v1, v3, Lhl;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    instance-of v1, v1, Lhl;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    instance-of v1, v3, Lel;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-gt v0, v2, :cond_0

    .line 43
    .line 44
    return v2

    .line 45
    :cond_2
    return v0
.end method


# virtual methods
.method public final a(Lo8;Ljava/util/List;Ljava/util/LinkedHashMap;Z)V
    .locals 9

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lqr5;

    .line 16
    .line 17
    iget-boolean v1, v0, Lqr5;->b:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lqr5;->c:Lnn3;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    iget-object v4, p0, Lpf5;->a:Ll37;

    .line 34
    .line 35
    if-eq v1, v3, :cond_a

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    if-eq v1, v5, :cond_9

    .line 39
    .line 40
    iget-object v1, v0, Lqr5;->a:Lul;

    .line 41
    .line 42
    invoke-virtual {v1}, Lul;->G0()I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v4}, Lqr5;->b(Lvp4;)V

    .line 46
    .line 47
    .line 48
    iget-object v5, v0, Lqr5;->e:[Ljx5;

    .line 49
    .line 50
    array-length v5, v5

    .line 51
    move v6, v2

    .line 52
    :goto_1
    if-ge v6, v5, :cond_3

    .line 53
    .line 54
    iget-object v7, v0, Lqr5;->e:[Ljx5;

    .line 55
    .line 56
    aget-object v7, v7, v6

    .line 57
    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object v5, p0, Lpf5;->r:Ljava/util/LinkedList;

    .line 66
    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_4

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_4
    invoke-virtual {v1}, Lul;->G0()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-ne v5, v3, :cond_8

    .line 82
    .line 83
    iget-object v5, v0, Lqr5;->d:[Ljx5;

    .line 84
    .line 85
    aget-object v5, v5, v2

    .line 86
    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    iget-object v6, v5, Ljx5;->X:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lrf5;

    .line 96
    .line 97
    if-eqz v6, :cond_5

    .line 98
    .line 99
    invoke-virtual {v6}, Lrf5;->F()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_7

    .line 104
    .line 105
    invoke-virtual {v6}, Lrf5;->E()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_7

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-virtual {p3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_7

    .line 125
    .line 126
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    check-cast v7, Lrf5;

    .line 131
    .line 132
    invoke-virtual {v7}, Lrf5;->F()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    invoke-virtual {v7}, Lrf5;->E()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_6

    .line 143
    .line 144
    iget-object v8, v7, Lrf5;->h0:Ljp;

    .line 145
    .line 146
    invoke-static {v8, v5}, Lrf5;->A(Ljp;Ljx5;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-nez v8, :cond_9

    .line 151
    .line 152
    iget-object v8, v7, Lrf5;->j0:Ljp;

    .line 153
    .line 154
    invoke-static {v8, v5}, Lrf5;->A(Ljp;Ljx5;)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_9

    .line 159
    .line 160
    iget-object v8, v7, Lrf5;->k0:Ljp;

    .line 161
    .line 162
    invoke-static {v8, v5}, Lrf5;->A(Ljp;Ljx5;)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-nez v8, :cond_9

    .line 167
    .line 168
    iget-object v7, v7, Lrf5;->i0:Ljp;

    .line 169
    .line 170
    invoke-static {v7, v5}, Lrf5;->A(Ljp;Ljx5;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_6

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    iget-object v5, p0, Lpf5;->f:Lm85;

    .line 178
    .line 179
    if-eqz v5, :cond_a

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Lul;->F0(I)Lll;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v5, v1}, Lm85;->i(Lgl;)Ljj3;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_a

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    invoke-virtual {v0, v4}, Lqr5;->a(Ll37;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    goto :goto_3

    .line 197
    :cond_9
    :goto_2
    move v2, v3

    .line 198
    :cond_a
    :goto_3
    if-eqz v2, :cond_b

    .line 199
    .line 200
    if-nez p4, :cond_0

    .line 201
    .line 202
    const-string v1, "explicit"

    .line 203
    .line 204
    invoke-virtual {p1, v4, v0, v1, v3}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_b
    iget-object v1, p1, Lo8;->f0:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Ljava/util/ArrayList;

    .line 212
    .line 213
    if-nez v1, :cond_c

    .line 214
    .line 215
    new-instance v1, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    iput-object v1, p1, Lo8;->f0:Ljava/lang/Object;

    .line 221
    .line 222
    :cond_c
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_d
    return-void
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final c(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lul;

    .line 30
    .line 31
    iget-boolean v2, p0, Lpf5;->g:Z

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v2, p0, Lpf5;->f:Lm85;

    .line 36
    .line 37
    iget-object v3, p0, Lpf5;->a:Ll37;

    .line 38
    .line 39
    invoke-virtual {v2, v3, v1}, Lm85;->d(Ll37;Lul;)Lnn3;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    :goto_1
    new-instance v3, Lqr5;

    .line 46
    .line 47
    invoke-direct {v3, v1, v2}, Lqr5;-><init>(Lul;Lnn3;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v0
.end method

.method public final d(Ljj3;Lgl;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p1, Ljj3;->X:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v0, p0, Lpf5;->s:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lpf5;->s:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lgl;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eq v0, p2, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "Duplicate injectable value with id \'%s\' (of type %s)"

    .line 45
    .line 46
    invoke-virtual {p0, p2, p1}, Lpf5;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0

    .line 51
    :cond_3
    :goto_0
    return-void
.end method

.method public final e(Ljava/util/LinkedHashMap;Ljx5;)Lrf5;
    .locals 3

    .line 1
    iget-object v0, p2, Ljx5;->X:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lrf5;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lrf5;

    .line 12
    .line 13
    iget-object v2, p0, Lpf5;->a:Ll37;

    .line 14
    .line 15
    iget-object p0, p0, Lpf5;->f:Lm85;

    .line 16
    .line 17
    invoke-direct {v1, v2, p0, p2, p2}, Lrf5;-><init>(Ll37;Lm85;Ljx5;Ljx5;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v1
.end method

.method public final f(Ljava/util/LinkedHashMap;Ljava/lang/String;)Lrf5;
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lrf5;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lrf5;

    .line 10
    .line 11
    iget-object v1, p0, Lpf5;->f:Lm85;

    .line 12
    .line 13
    invoke-static {p2}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object p0, p0, Lpf5;->a:Ll37;

    .line 18
    .line 19
    invoke-direct {v0, p0, v1, v2, v2}, Lrf5;-><init>(Ll37;Lm85;Ljx5;Ljx5;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v0
.end method

.method public final h(Ljava/util/LinkedHashMap;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lpf5;->f:Lm85;

    .line 2
    .line 3
    iget-object v1, p0, Lpf5;->d:Lal;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lm85;->G(Lvj8;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, Lpf5;->a:Ll37;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Lxp4;->v0:Lxp4;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Lvp4;->f(Lxp4;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_0
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lrf5;

    .line 45
    .line 46
    invoke-virtual {v5}, Lrf5;->i()Lix5;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v5, v5, Lix5;->Y:Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    move v4, v7

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v4, v6

    .line 57
    :goto_1
    if-eqz v4, :cond_3

    .line 58
    .line 59
    sget-object v5, Lxp4;->y0:Lxp4;

    .line 60
    .line 61
    invoke-virtual {v3, v5}, Lvp4;->f(Lxp4;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v7, v6

    .line 69
    :goto_2
    invoke-virtual {v0, v1}, Lm85;->F(Lal;)[Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    iget-object v1, p0, Lpf5;->k:Ljava/util/List;

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    new-instance v4, Ljava/util/TreeMap;

    .line 91
    .line 92
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    add-int v5, v1, v1

    .line 99
    .line 100
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 101
    .line 102
    .line 103
    :goto_3
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_6

    .line 116
    .line 117
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lrf5;

    .line 122
    .line 123
    invoke-virtual {v8}, Lrf5;->j()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-interface {v4, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    iget-object v5, p0, Lpf5;->m:Ljava/util/LinkedList;

    .line 132
    .line 133
    if-eqz v5, :cond_7

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Lgl;

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    iget-object v5, p0, Lpf5;->n:Ljava/util/LinkedList;

    .line 143
    .line 144
    if-eqz v5, :cond_e

    .line 145
    .line 146
    invoke-virtual {v5}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Lgl;

    .line 151
    .line 152
    :goto_5
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    mul-int/lit8 v9, v9, 0x2

    .line 159
    .line 160
    invoke-direct {v8, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    const/4 v9, 0x0

    .line 172
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_c

    .line 177
    .line 178
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    check-cast v10, Lrf5;

    .line 183
    .line 184
    iget-object v11, v10, Lrf5;->h0:Ljp;

    .line 185
    .line 186
    invoke-virtual {v5}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    :goto_7
    if-eqz v11, :cond_9

    .line 191
    .line 192
    iget-object v13, v11, Ljp;->g:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v13, Lgl;

    .line 195
    .line 196
    invoke-virtual {v13}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    if-ne v13, v12, :cond_8

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_8
    iget-object v11, v11, Ljp;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v11, Ljp;

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_9
    iget-object v11, v10, Lrf5;->j0:Ljp;

    .line 209
    .line 210
    invoke-virtual {v5}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    :goto_8
    if-eqz v11, :cond_b

    .line 215
    .line 216
    iget-object v13, v11, Ljp;->g:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v13, Lgl;

    .line 219
    .line 220
    invoke-virtual {v13}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 221
    .line 222
    .line 223
    move-result-object v13

    .line 224
    if-ne v13, v12, :cond_a

    .line 225
    .line 226
    :goto_9
    move-object v9, v10

    .line 227
    goto :goto_6

    .line 228
    :cond_a
    iget-object v11, v11, Ljp;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v11, Ljp;

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_b
    invoke-virtual {v10}, Lrf5;->j()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-interface {v8, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_c
    if-eqz v9, :cond_d

    .line 242
    .line 243
    invoke-virtual {v9}, Lrf5;->j()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-interface {v8, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_d
    move-object v4, v8

    .line 251
    :cond_e
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 252
    .line 253
    add-int/2addr v1, v1

    .line 254
    invoke-direct {v5, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 255
    .line 256
    .line 257
    if-eqz v0, :cond_12

    .line 258
    .line 259
    array-length v1, v0

    .line 260
    :goto_a
    if-ge v6, v1, :cond_12

    .line 261
    .line 262
    aget-object v8, v0, v6

    .line 263
    .line 264
    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    check-cast v9, Lrf5;

    .line 269
    .line 270
    if-nez v9, :cond_10

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    :cond_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-eqz v11, :cond_10

    .line 285
    .line 286
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, Lrf5;

    .line 291
    .line 292
    iget-object v12, v11, Lrf5;->g0:Ljx5;

    .line 293
    .line 294
    iget-object v12, v12, Ljx5;->X:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    if-eqz v12, :cond_f

    .line 301
    .line 302
    invoke-virtual {v11}, Lrf5;->j()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    move-object v9, v11

    .line 307
    :cond_10
    if-eqz v9, :cond_11

    .line 308
    .line 309
    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_12
    if-eqz v7, :cond_15

    .line 316
    .line 317
    new-instance v0, Ljava/util/TreeMap;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    :cond_13
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-eqz v6, :cond_14

    .line 335
    .line 336
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    check-cast v6, Ljava/util/Map$Entry;

    .line 341
    .line 342
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    check-cast v6, Lrf5;

    .line 347
    .line 348
    invoke-virtual {v6}, Lrf5;->i()Lix5;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    iget-object v7, v7, Lix5;->Y:Ljava/lang/Integer;

    .line 353
    .line 354
    if-eqz v7, :cond_13

    .line 355
    .line 356
    invoke-virtual {v0, v7, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 360
    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_14
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_15

    .line 376
    .line 377
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Lrf5;

    .line 382
    .line 383
    invoke-virtual {v1}, Lrf5;->j()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    invoke-interface {v5, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_15
    iget-object v0, p0, Lpf5;->k:Ljava/util/List;

    .line 392
    .line 393
    if-eqz v0, :cond_1c

    .line 394
    .line 395
    if-eqz v2, :cond_16

    .line 396
    .line 397
    sget-object v0, Lxp4;->w0:Lxp4;

    .line 398
    .line 399
    invoke-virtual {v3, v0}, Lvp4;->f(Lxp4;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_1c

    .line 404
    .line 405
    :cond_16
    if-eqz v2, :cond_19

    .line 406
    .line 407
    sget-object v0, Lxp4;->x0:Lxp4;

    .line 408
    .line 409
    invoke-virtual {v3, v0}, Lvp4;->f(Lxp4;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_19

    .line 414
    .line 415
    new-instance v0, Ljava/util/TreeMap;

    .line 416
    .line 417
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 418
    .line 419
    .line 420
    iget-object p0, p0, Lpf5;->k:Ljava/util/List;

    .line 421
    .line 422
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    :cond_17
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-eqz v1, :cond_18

    .line 431
    .line 432
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Lrf5;

    .line 437
    .line 438
    if-eqz v1, :cond_17

    .line 439
    .line 440
    invoke-virtual {v1}, Lrf5;->j()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_18
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    goto :goto_e

    .line 453
    :cond_19
    iget-object p0, p0, Lpf5;->k:Ljava/util/List;

    .line 454
    .line 455
    :goto_e
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    :cond_1a
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_1c

    .line 464
    .line 465
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    check-cast v0, Lrf5;

    .line 470
    .line 471
    if-nez v0, :cond_1b

    .line 472
    .line 473
    goto :goto_f

    .line 474
    :cond_1b
    invoke-virtual {v0}, Lrf5;->j()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_1a

    .line 483
    .line 484
    invoke-interface {v5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_1c
    invoke-interface {v5, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 492
    .line 493
    .line 494
    invoke-interface {p1, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 495
    .line 496
    .line 497
    return-void
.end method

.method public final i()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lpf5;->d:Lal;

    .line 4
    .line 5
    iget-object v2, v1, Lal;->C0:Ljava/lang/Class;

    .line 6
    .line 7
    new-instance v3, Lo8;

    .line 8
    .line 9
    const/4 v4, 0x7

    .line 10
    invoke-direct {v3, v4}, Lo8;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iput-object v3, v0, Lpf5;->l:Lo8;

    .line 14
    .line 15
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v4, Lxp4;->f0:Lxp4;

    .line 21
    .line 22
    iget-object v5, v0, Lpf5;->a:Ll37;

    .line 23
    .line 24
    invoke-virtual {v5, v4}, Lvp4;->f(Lxp4;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v1}, Lal;->A0()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    iget-object v8, v0, Lpf5;->e:Lhz8;

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    iget-object v12, v0, Lpf5;->f:Lm85;

    .line 44
    .line 45
    if-eqz v7, :cond_10

    .line 46
    .line 47
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    move-object v14, v7

    .line 52
    check-cast v14, Lel;

    .line 53
    .line 54
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v12, v14}, Lm85;->R(Lgl;)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    invoke-virtual {v7, v13}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    if-eqz v13, :cond_1

    .line 65
    .line 66
    iget-object v13, v0, Lpf5;->q:Ljava/util/LinkedList;

    .line 67
    .line 68
    if-nez v13, :cond_0

    .line 69
    .line 70
    new-instance v13, Ljava/util/LinkedList;

    .line 71
    .line 72
    invoke-direct {v13}, Ljava/util/LinkedList;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v13, v0, Lpf5;->q:Ljava/util/LinkedList;

    .line 76
    .line 77
    :cond_0
    invoke-virtual {v13, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-virtual {v12, v14}, Lm85;->S(Lgl;)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    invoke-virtual {v7, v13}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-eqz v13, :cond_3

    .line 89
    .line 90
    iget-object v7, v0, Lpf5;->r:Ljava/util/LinkedList;

    .line 91
    .line 92
    if-nez v7, :cond_2

    .line 93
    .line 94
    new-instance v7, Ljava/util/LinkedList;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v7, v0, Lpf5;->r:Ljava/util/LinkedList;

    .line 100
    .line 101
    :cond_2
    invoke-virtual {v7, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {v12, v14}, Lm85;->O(Lgl;)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-virtual {v7, v13}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    invoke-virtual {v12, v14}, Lm85;->Q(Lgl;)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    invoke-virtual {v7, v15}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-nez v13, :cond_4

    .line 122
    .line 123
    if-eqz v7, :cond_8

    .line 124
    .line 125
    :cond_4
    if-eqz v13, :cond_6

    .line 126
    .line 127
    iget-object v13, v0, Lpf5;->n:Ljava/util/LinkedList;

    .line 128
    .line 129
    if-nez v13, :cond_5

    .line 130
    .line 131
    new-instance v13, Ljava/util/LinkedList;

    .line 132
    .line 133
    invoke-direct {v13}, Ljava/util/LinkedList;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v13, v0, Lpf5;->n:Ljava/util/LinkedList;

    .line 137
    .line 138
    :cond_5
    invoke-virtual {v13, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_6
    if-eqz v7, :cond_8

    .line 142
    .line 143
    iget-object v7, v0, Lpf5;->p:Ljava/util/LinkedList;

    .line 144
    .line 145
    if-nez v7, :cond_7

    .line 146
    .line 147
    new-instance v7, Ljava/util/LinkedList;

    .line 148
    .line 149
    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v7, v0, Lpf5;->p:Ljava/util/LinkedList;

    .line 153
    .line 154
    :cond_7
    invoke-virtual {v7, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    iget-object v7, v14, Lel;->D0:Ljava/lang/reflect/Field;

    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-nez v7, :cond_9

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_9
    invoke-static {v7, v9}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v14}, Lm85;->m(Lgl;)Ljx5;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    if-eqz v13, :cond_a

    .line 176
    .line 177
    const/4 v15, 0x1

    .line 178
    goto :goto_1

    .line 179
    :cond_a
    const/4 v15, 0x0

    .line 180
    :goto_1
    if-eqz v15, :cond_b

    .line 181
    .line 182
    invoke-virtual {v13}, Ljx5;->c()Z

    .line 183
    .line 184
    .line 185
    move-result v16

    .line 186
    if-eqz v16, :cond_b

    .line 187
    .line 188
    invoke-static {v7, v9}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    :goto_2
    move-object/from16 v16, v13

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_b
    move/from16 v17, v15

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :goto_3
    if-eqz v16, :cond_c

    .line 201
    .line 202
    const/4 v10, 0x1

    .line 203
    goto :goto_4

    .line 204
    :cond_c
    const/4 v10, 0x0

    .line 205
    :goto_4
    if-nez v10, :cond_d

    .line 206
    .line 207
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v9, v14, Lel;->D0:Ljava/lang/reflect/Field;

    .line 211
    .line 212
    iget-object v8, v8, Lhz8;->g0:Lhn3;

    .line 213
    .line 214
    invoke-virtual {v8, v9}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    :cond_d
    move/from16 v18, v10

    .line 219
    .line 220
    invoke-virtual {v12, v14}, Lm85;->U(Lgl;)Z

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    iget-object v9, v14, Lel;->D0:Ljava/lang/reflect/Field;

    .line 225
    .line 226
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-eqz v9, :cond_f

    .line 235
    .line 236
    if-nez v15, :cond_f

    .line 237
    .line 238
    if-eqz v4, :cond_e

    .line 239
    .line 240
    const/16 v19, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_e
    if-nez v8, :cond_f

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_f
    move/from16 v19, v8

    .line 248
    .line 249
    :goto_5
    invoke-virtual {v0, v3, v7}, Lpf5;->f(Ljava/util/LinkedHashMap;Ljava/lang/String;)Lrf5;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    new-instance v13, Ljp;

    .line 254
    .line 255
    iget-object v15, v7, Lrf5;->h0:Ljp;

    .line 256
    .line 257
    invoke-direct/range {v13 .. v19}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 258
    .line 259
    .line 260
    iput-object v13, v7, Lrf5;->h0:Ljp;

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_10
    invoke-virtual {v1}, Lal;->B0()Lkl;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v4}, Lkl;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    :cond_11
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    const/4 v7, 0x2

    .line 277
    iget-boolean v13, v0, Lpf5;->h:Z

    .line 278
    .line 279
    if-eqz v6, :cond_29

    .line 280
    .line 281
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    move-object v15, v6

    .line 286
    check-cast v15, Lhl;

    .line 287
    .line 288
    invoke-virtual {v15}, Lhl;->G0()I

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    iget-object v14, v15, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 293
    .line 294
    iget-object v10, v0, Lpf5;->b:Lce1;

    .line 295
    .line 296
    if-nez v6, :cond_21

    .line 297
    .line 298
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 303
    .line 304
    if-eq v6, v7, :cond_11

    .line 305
    .line 306
    const-class v7, Ljava/lang/Void;

    .line 307
    .line 308
    if-ne v6, v7, :cond_12

    .line 309
    .line 310
    sget-object v6, Lxp4;->p0:Lxp4;

    .line 311
    .line 312
    invoke-virtual {v5, v6}, Lvp4;->f(Lxp4;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-nez v6, :cond_12

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_12
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v12, v15}, Lm85;->O(Lgl;)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {v6, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    if-eqz v7, :cond_14

    .line 330
    .line 331
    iget-object v6, v0, Lpf5;->m:Ljava/util/LinkedList;

    .line 332
    .line 333
    if-nez v6, :cond_13

    .line 334
    .line 335
    new-instance v6, Ljava/util/LinkedList;

    .line 336
    .line 337
    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 338
    .line 339
    .line 340
    iput-object v6, v0, Lpf5;->m:Ljava/util/LinkedList;

    .line 341
    .line 342
    :cond_13
    invoke-virtual {v6, v15}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_14
    invoke-virtual {v12, v15}, Lm85;->R(Lgl;)Ljava/lang/Boolean;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v6, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    if-eqz v7, :cond_16

    .line 355
    .line 356
    iget-object v6, v0, Lpf5;->q:Ljava/util/LinkedList;

    .line 357
    .line 358
    if-nez v6, :cond_15

    .line 359
    .line 360
    new-instance v6, Ljava/util/LinkedList;

    .line 361
    .line 362
    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 363
    .line 364
    .line 365
    iput-object v6, v0, Lpf5;->q:Ljava/util/LinkedList;

    .line 366
    .line 367
    :cond_15
    invoke-virtual {v6, v15}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_16
    invoke-virtual {v12, v15}, Lm85;->S(Lgl;)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-virtual {v6, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    if-eqz v6, :cond_18

    .line 380
    .line 381
    iget-object v6, v0, Lpf5;->r:Ljava/util/LinkedList;

    .line 382
    .line 383
    if-nez v6, :cond_17

    .line 384
    .line 385
    new-instance v6, Ljava/util/LinkedList;

    .line 386
    .line 387
    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 388
    .line 389
    .line 390
    iput-object v6, v0, Lpf5;->r:Ljava/util/LinkedList;

    .line 391
    .line 392
    :cond_17
    invoke-virtual {v6, v15}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_18
    :goto_7
    invoke-virtual {v12, v15}, Lm85;->m(Lgl;)Ljx5;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    if-eqz v6, :cond_19

    .line 401
    .line 402
    const/4 v7, 0x1

    .line 403
    goto :goto_8

    .line 404
    :cond_19
    const/4 v7, 0x0

    .line 405
    :goto_8
    if-nez v7, :cond_1c

    .line 406
    .line 407
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v11

    .line 411
    invoke-virtual {v10, v15, v11}, Lce1;->c(Lhl;Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v11

    .line 415
    if-nez v11, :cond_1b

    .line 416
    .line 417
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    invoke-virtual {v10, v15, v11}, Lce1;->a(Lhl;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    if-nez v11, :cond_1a

    .line 426
    .line 427
    goto/16 :goto_6

    .line 428
    .line 429
    :cond_1a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget-object v10, v8, Lhz8;->Y:Lhn3;

    .line 433
    .line 434
    invoke-virtual {v10, v14}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    :goto_9
    move-object/from16 v17, v6

    .line 439
    .line 440
    move/from16 v18, v7

    .line 441
    .line 442
    move/from16 v19, v10

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_1b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object v10, v8, Lhz8;->X:Lhn3;

    .line 449
    .line 450
    invoke-virtual {v10, v14}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    goto :goto_9

    .line 455
    :cond_1c
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    invoke-virtual {v10, v15, v11}, Lce1;->c(Lhl;Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v11

    .line 463
    if-nez v11, :cond_1d

    .line 464
    .line 465
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    invoke-virtual {v10, v15, v11}, Lce1;->a(Lhl;Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    :cond_1d
    if-nez v11, :cond_1e

    .line 474
    .line 475
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    move-object v11, v10

    .line 480
    :cond_1e
    invoke-virtual {v6}, Ljx5;->c()Z

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    if-eqz v10, :cond_1f

    .line 485
    .line 486
    invoke-static {v11, v9}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    const/4 v7, 0x0

    .line 491
    :cond_1f
    move-object/from16 v17, v6

    .line 492
    .line 493
    move/from16 v18, v7

    .line 494
    .line 495
    const/16 v19, 0x1

    .line 496
    .line 497
    :goto_a
    invoke-virtual {v0, v11}, Lpf5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-virtual {v12, v15}, Lm85;->U(Lgl;)Z

    .line 502
    .line 503
    .line 504
    move-result v20

    .line 505
    if-eqz v13, :cond_20

    .line 506
    .line 507
    if-nez v18, :cond_20

    .line 508
    .line 509
    if-eqz v20, :cond_20

    .line 510
    .line 511
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    if-nez v7, :cond_20

    .line 520
    .line 521
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    check-cast v7, Lrf5;

    .line 526
    .line 527
    if-eqz v7, :cond_20

    .line 528
    .line 529
    iget-object v7, v7, Lrf5;->h0:Ljp;

    .line 530
    .line 531
    if-eqz v7, :cond_20

    .line 532
    .line 533
    goto/16 :goto_6

    .line 534
    .line 535
    :cond_20
    invoke-virtual {v0, v3, v6}, Lpf5;->f(Ljava/util/LinkedHashMap;Ljava/lang/String;)Lrf5;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    new-instance v14, Ljp;

    .line 540
    .line 541
    iget-object v7, v6, Lrf5;->j0:Ljp;

    .line 542
    .line 543
    move-object/from16 v16, v7

    .line 544
    .line 545
    invoke-direct/range {v14 .. v20}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 546
    .line 547
    .line 548
    iput-object v14, v6, Lrf5;->j0:Ljp;

    .line 549
    .line 550
    goto/16 :goto_6

    .line 551
    .line 552
    :cond_21
    const/4 v11, 0x1

    .line 553
    if-ne v6, v11, :cond_27

    .line 554
    .line 555
    invoke-virtual {v12, v15}, Lm85;->l(Lgl;)Ljx5;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    if-eqz v6, :cond_22

    .line 560
    .line 561
    const/4 v7, 0x1

    .line 562
    goto :goto_b

    .line 563
    :cond_22
    const/4 v7, 0x0

    .line 564
    :goto_b
    if-nez v7, :cond_24

    .line 565
    .line 566
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    invoke-virtual {v10, v11}, Lce1;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    if-nez v10, :cond_23

    .line 575
    .line 576
    goto/16 :goto_6

    .line 577
    .line 578
    :cond_23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    iget-object v11, v8, Lhz8;->Z:Lhn3;

    .line 582
    .line 583
    invoke-virtual {v11, v14}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 584
    .line 585
    .line 586
    move-result v11

    .line 587
    move/from16 v19, v11

    .line 588
    .line 589
    :goto_c
    move-object/from16 v17, v6

    .line 590
    .line 591
    move/from16 v18, v7

    .line 592
    .line 593
    goto :goto_d

    .line 594
    :cond_24
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v11

    .line 598
    invoke-virtual {v10, v11}, Lce1;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v10

    .line 602
    if-nez v10, :cond_25

    .line 603
    .line 604
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v10

    .line 608
    :cond_25
    invoke-virtual {v6}, Ljx5;->c()Z

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    if-eqz v11, :cond_26

    .line 613
    .line 614
    invoke-static {v10, v9}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 615
    .line 616
    .line 617
    move-result-object v6

    .line 618
    const/4 v7, 0x0

    .line 619
    :cond_26
    const/16 v19, 0x1

    .line 620
    .line 621
    goto :goto_c

    .line 622
    :goto_d
    invoke-virtual {v0, v10}, Lpf5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    invoke-virtual {v12, v15}, Lm85;->U(Lgl;)Z

    .line 627
    .line 628
    .line 629
    move-result v20

    .line 630
    invoke-virtual {v0, v3, v6}, Lpf5;->f(Ljava/util/LinkedHashMap;Ljava/lang/String;)Lrf5;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    new-instance v14, Ljp;

    .line 635
    .line 636
    iget-object v7, v6, Lrf5;->k0:Ljp;

    .line 637
    .line 638
    move-object/from16 v16, v7

    .line 639
    .line 640
    invoke-direct/range {v14 .. v20}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 641
    .line 642
    .line 643
    iput-object v14, v6, Lrf5;->k0:Ljp;

    .line 644
    .line 645
    goto/16 :goto_6

    .line 646
    .line 647
    :cond_27
    if-ne v6, v7, :cond_11

    .line 648
    .line 649
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 650
    .line 651
    invoke-virtual {v12, v15}, Lm85;->Q(Lgl;)Ljava/lang/Boolean;

    .line 652
    .line 653
    .line 654
    move-result-object v7

    .line 655
    invoke-virtual {v6, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v6

    .line 659
    if-eqz v6, :cond_11

    .line 660
    .line 661
    iget-object v6, v0, Lpf5;->o:Ljava/util/LinkedList;

    .line 662
    .line 663
    if-nez v6, :cond_28

    .line 664
    .line 665
    new-instance v6, Ljava/util/LinkedList;

    .line 666
    .line 667
    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 668
    .line 669
    .line 670
    iput-object v6, v0, Lpf5;->o:Ljava/util/LinkedList;

    .line 671
    .line 672
    :cond_28
    invoke-virtual {v6, v15}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    goto/16 :goto_6

    .line 676
    .line 677
    :cond_29
    iget-object v4, v1, Lal;->O0:Ljava/lang/Boolean;

    .line 678
    .line 679
    if-nez v4, :cond_2c

    .line 680
    .line 681
    sget-object v4, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 682
    .line 683
    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 688
    .line 689
    .line 690
    move-result v4

    .line 691
    if-nez v4, :cond_2b

    .line 692
    .line 693
    invoke-static {v2}, Lit0;->s(Ljava/lang/Class;)Z

    .line 694
    .line 695
    .line 696
    move-result v4

    .line 697
    if-eqz v4, :cond_2a

    .line 698
    .line 699
    move-object v4, v9

    .line 700
    goto :goto_e

    .line 701
    :cond_2a
    invoke-virtual {v2}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    :goto_e
    if-eqz v4, :cond_2b

    .line 706
    .line 707
    const/4 v4, 0x1

    .line 708
    goto :goto_f

    .line 709
    :cond_2b
    const/4 v4, 0x0

    .line 710
    :goto_f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    iput-object v4, v1, Lal;->O0:Ljava/lang/Boolean;

    .line 715
    .line 716
    :cond_2c
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    if-nez v4, :cond_70

    .line 721
    .line 722
    iget-object v4, v0, Lpf5;->l:Lo8;

    .line 723
    .line 724
    invoke-virtual {v1}, Lal;->z0()Llr;

    .line 725
    .line 726
    .line 727
    move-result-object v10

    .line 728
    iget-object v10, v10, Llr;->Z:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v10, Ljava/util/List;

    .line 731
    .line 732
    invoke-virtual {v0, v10}, Lpf5;->c(Ljava/util/List;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v10

    .line 736
    invoke-virtual {v1}, Lal;->z0()Llr;

    .line 737
    .line 738
    .line 739
    move-result-object v11

    .line 740
    iget-object v11, v11, Llr;->f0:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v11, Ljava/util/List;

    .line 743
    .line 744
    invoke-virtual {v0, v11}, Lpf5;->c(Ljava/util/List;)Ljava/util/List;

    .line 745
    .line 746
    .line 747
    move-result-object v11

    .line 748
    invoke-virtual {v1}, Lal;->z0()Llr;

    .line 749
    .line 750
    .line 751
    move-result-object v14

    .line 752
    iget-object v14, v14, Llr;->Y:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v14, Lcl;

    .line 755
    .line 756
    iget-boolean v15, v0, Lpf5;->g:Z

    .line 757
    .line 758
    if-nez v14, :cond_2d

    .line 759
    .line 760
    move-object v7, v9

    .line 761
    goto :goto_11

    .line 762
    :cond_2d
    if-eqz v15, :cond_2e

    .line 763
    .line 764
    invoke-virtual {v12, v5, v14}, Lm85;->d(Ll37;Lul;)Lnn3;

    .line 765
    .line 766
    .line 767
    move-result-object v16

    .line 768
    move-object/from16 v6, v16

    .line 769
    .line 770
    goto :goto_10

    .line 771
    :cond_2e
    move-object v6, v9

    .line 772
    :goto_10
    new-instance v7, Lqr5;

    .line 773
    .line 774
    invoke-direct {v7, v14, v6}, Lqr5;-><init>(Lul;Lnn3;)V

    .line 775
    .line 776
    .line 777
    :goto_11
    if-eqz v13, :cond_3c

    .line 778
    .line 779
    sget-object v13, Laj3;->e:Ljava/lang/RuntimeException;

    .line 780
    .line 781
    if-nez v13, :cond_3b

    .line 782
    .line 783
    sget-object v13, Laj3;->d:Laj3;

    .line 784
    .line 785
    invoke-virtual {v13, v2}, Laj3;->a(Ljava/lang/Class;)[Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v14

    .line 789
    if-nez v14, :cond_2f

    .line 790
    .line 791
    move-object v6, v9

    .line 792
    goto/16 :goto_14

    .line 793
    .line 794
    :cond_2f
    array-length v6, v14

    .line 795
    new-array v6, v6, [Lzz2;

    .line 796
    .line 797
    move-object/from16 v20, v2

    .line 798
    .line 799
    const/4 v9, 0x0

    .line 800
    :goto_12
    array-length v2, v14

    .line 801
    if-ge v9, v2, :cond_30

    .line 802
    .line 803
    :try_start_0
    iget-object v2, v13, Laj3;->b:Ljava/lang/reflect/Method;

    .line 804
    .line 805
    move-object/from16 v21, v6

    .line 806
    .line 807
    aget-object v6, v14, v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 808
    .line 809
    move/from16 v22, v9

    .line 810
    .line 811
    const/4 v9, 0x0

    .line 812
    :try_start_1
    invoke-virtual {v2, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 817
    .line 818
    :try_start_2
    iget-object v6, v13, Laj3;->c:Ljava/lang/reflect/Method;

    .line 819
    .line 820
    move-object/from16 v23, v13

    .line 821
    .line 822
    aget-object v13, v14, v22

    .line 823
    .line 824
    invoke-virtual {v6, v13, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v6

    .line 828
    check-cast v6, Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 829
    .line 830
    new-instance v9, Lzz2;

    .line 831
    .line 832
    const/4 v13, 0x4

    .line 833
    invoke-direct {v9, v6, v2, v13}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 834
    .line 835
    .line 836
    aput-object v9, v21, v22

    .line 837
    .line 838
    add-int/lit8 v9, v22, 0x1

    .line 839
    .line 840
    move-object/from16 v6, v21

    .line 841
    .line 842
    move-object/from16 v13, v23

    .line 843
    .line 844
    goto :goto_12

    .line 845
    :catch_0
    move-exception v0

    .line 846
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 847
    .line 848
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    array-length v3, v14

    .line 853
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    invoke-static/range {v20 .. v20}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    const-string v3, "Failed to access type of field #%d (of %d) of Record type %s"

    .line 866
    .line 867
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 872
    .line 873
    .line 874
    throw v1

    .line 875
    :catch_1
    move-exception v0

    .line 876
    goto :goto_13

    .line 877
    :catch_2
    move-exception v0

    .line 878
    move/from16 v22, v9

    .line 879
    .line 880
    :goto_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 881
    .line 882
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    array-length v3, v14

    .line 887
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    invoke-static/range {v20 .. v20}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    const-string v3, "Failed to access name of field #%d (of %d) of Record type %s"

    .line 900
    .line 901
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 906
    .line 907
    .line 908
    throw v1

    .line 909
    :cond_30
    move-object/from16 v21, v6

    .line 910
    .line 911
    :goto_14
    if-nez v6, :cond_31

    .line 912
    .line 913
    goto/16 :goto_19

    .line 914
    .line 915
    :cond_31
    array-length v2, v6

    .line 916
    if-nez v2, :cond_32

    .line 917
    .line 918
    invoke-virtual {v1}, Lal;->z0()Llr;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    iget-object v9, v9, Llr;->Y:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v9, Lcl;

    .line 925
    .line 926
    if-eqz v9, :cond_32

    .line 927
    .line 928
    new-instance v2, Lqr5;

    .line 929
    .line 930
    const/4 v6, 0x0

    .line 931
    invoke-direct {v2, v9, v6}, Lqr5;-><init>(Lul;Lnn3;)V

    .line 932
    .line 933
    .line 934
    move-object v13, v2

    .line 935
    goto/16 :goto_1a

    .line 936
    .line 937
    :cond_32
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 938
    .line 939
    .line 940
    move-result-object v9

    .line 941
    :goto_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 942
    .line 943
    .line 944
    move-result v13

    .line 945
    if-eqz v13, :cond_3a

    .line 946
    .line 947
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v13

    .line 951
    check-cast v13, Lqr5;

    .line 952
    .line 953
    iget-object v14, v13, Lqr5;->a:Lul;

    .line 954
    .line 955
    move-object/from16 v20, v6

    .line 956
    .line 957
    invoke-virtual {v14}, Lul;->G0()I

    .line 958
    .line 959
    .line 960
    move-result v6

    .line 961
    if-eq v6, v2, :cond_33

    .line 962
    .line 963
    move-object/from16 v6, v20

    .line 964
    .line 965
    goto :goto_15

    .line 966
    :cond_33
    const/4 v6, 0x0

    .line 967
    :goto_16
    if-ge v6, v2, :cond_35

    .line 968
    .line 969
    move-object/from16 v21, v9

    .line 970
    .line 971
    invoke-virtual {v14, v6}, Lul;->I0(I)Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    move-result-object v9

    .line 975
    move/from16 v22, v6

    .line 976
    .line 977
    aget-object v6, v20, v22

    .line 978
    .line 979
    iget-object v6, v6, Lzz2;->Y:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v6, Ljava/lang/Class;

    .line 982
    .line 983
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v6

    .line 987
    if-nez v6, :cond_34

    .line 988
    .line 989
    move-object/from16 v6, v20

    .line 990
    .line 991
    move-object/from16 v9, v21

    .line 992
    .line 993
    goto :goto_15

    .line 994
    :cond_34
    add-int/lit8 v6, v22, 0x1

    .line 995
    .line 996
    move-object/from16 v9, v21

    .line 997
    .line 998
    goto :goto_16

    .line 999
    :cond_35
    new-array v6, v2, [Ljx5;

    .line 1000
    .line 1001
    const/4 v9, 0x0

    .line 1002
    :goto_17
    if-ge v9, v2, :cond_36

    .line 1003
    .line 1004
    move/from16 v21, v2

    .line 1005
    .line 1006
    aget-object v2, v20, v9

    .line 1007
    .line 1008
    iget-object v2, v2, Lzz2;->Z:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v2, Ljava/lang/String;

    .line 1011
    .line 1012
    invoke-static {v2}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    aput-object v2, v6, v9

    .line 1017
    .line 1018
    add-int/lit8 v9, v9, 0x1

    .line 1019
    .line 1020
    move/from16 v2, v21

    .line 1021
    .line 1022
    goto :goto_17

    .line 1023
    :cond_36
    iget-object v2, v13, Lqr5;->d:[Ljx5;

    .line 1024
    .line 1025
    if-eqz v2, :cond_37

    .line 1026
    .line 1027
    goto :goto_1a

    .line 1028
    :cond_37
    invoke-virtual {v14}, Lul;->G0()I

    .line 1029
    .line 1030
    .line 1031
    move-result v2

    .line 1032
    if-nez v2, :cond_38

    .line 1033
    .line 1034
    sget-object v2, Lqr5;->f:[Ljx5;

    .line 1035
    .line 1036
    iput-object v2, v13, Lqr5;->e:[Ljx5;

    .line 1037
    .line 1038
    iput-object v2, v13, Lqr5;->d:[Ljx5;

    .line 1039
    .line 1040
    goto :goto_1a

    .line 1041
    :cond_38
    new-array v9, v2, [Ljx5;

    .line 1042
    .line 1043
    iput-object v9, v13, Lqr5;->e:[Ljx5;

    .line 1044
    .line 1045
    iput-object v6, v13, Lqr5;->d:[Ljx5;

    .line 1046
    .line 1047
    invoke-virtual {v5}, Lvp4;->d()Lm85;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v6

    .line 1051
    const/4 v9, 0x0

    .line 1052
    :goto_18
    if-ge v9, v2, :cond_3d

    .line 1053
    .line 1054
    move/from16 v20, v2

    .line 1055
    .line 1056
    invoke-virtual {v14, v9}, Lul;->F0(I)Lll;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v2

    .line 1060
    invoke-virtual {v6, v2}, Lm85;->l(Lgl;)Ljx5;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    if-eqz v2, :cond_39

    .line 1065
    .line 1066
    invoke-virtual {v2}, Ljx5;->c()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v21

    .line 1070
    if-nez v21, :cond_39

    .line 1071
    .line 1072
    move-object/from16 v21, v2

    .line 1073
    .line 1074
    iget-object v2, v13, Lqr5;->e:[Ljx5;

    .line 1075
    .line 1076
    aput-object v21, v2, v9

    .line 1077
    .line 1078
    :cond_39
    add-int/lit8 v9, v9, 0x1

    .line 1079
    .line 1080
    move/from16 v2, v20

    .line 1081
    .line 1082
    goto :goto_18

    .line 1083
    :cond_3a
    iget-object v0, v1, Lal;->B0:Ldh8;

    .line 1084
    .line 1085
    invoke-static {v0}, Lit0;->n(Ldh8;)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    const-string v1, "Failed to find the canonical Record constructor of type "

    .line 1090
    .line 1091
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    return-void

    .line 1099
    :cond_3b
    throw v13

    .line 1100
    :cond_3c
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    :goto_19
    const/4 v13, 0x0

    .line 1104
    :cond_3d
    :goto_1a
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    :cond_3e
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v6

    .line 1112
    sget-object v9, Lnn3;->Y:Lnn3;

    .line 1113
    .line 1114
    if-eqz v6, :cond_3f

    .line 1115
    .line 1116
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v6

    .line 1120
    check-cast v6, Lqr5;

    .line 1121
    .line 1122
    iget-object v6, v6, Lqr5;->c:Lnn3;

    .line 1123
    .line 1124
    if-ne v6, v9, :cond_3e

    .line 1125
    .line 1126
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1127
    .line 1128
    .line 1129
    goto :goto_1b

    .line 1130
    :cond_3f
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    :cond_40
    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1135
    .line 1136
    .line 1137
    move-result v6

    .line 1138
    if-eqz v6, :cond_41

    .line 1139
    .line 1140
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    check-cast v6, Lqr5;

    .line 1145
    .line 1146
    iget-object v6, v6, Lqr5;->c:Lnn3;

    .line 1147
    .line 1148
    if-ne v6, v9, :cond_40

    .line 1149
    .line 1150
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1151
    .line 1152
    .line 1153
    goto :goto_1c

    .line 1154
    :cond_41
    if-eqz v7, :cond_42

    .line 1155
    .line 1156
    iget-object v2, v7, Lqr5;->c:Lnn3;

    .line 1157
    .line 1158
    if-ne v2, v9, :cond_42

    .line 1159
    .line 1160
    const/4 v7, 0x0

    .line 1161
    :cond_42
    iget-object v2, v0, Lpf5;->c:Ldh8;

    .line 1162
    .line 1163
    iget-object v2, v2, Ldh8;->j0:Ljava/lang/Class;

    .line 1164
    .line 1165
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v6

    .line 1169
    :goto_1d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1170
    .line 1171
    .line 1172
    move-result v9

    .line 1173
    if-eqz v9, :cond_48

    .line 1174
    .line 1175
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v9

    .line 1179
    check-cast v9, Lqr5;

    .line 1180
    .line 1181
    iget-boolean v14, v9, Lqr5;->b:Z

    .line 1182
    .line 1183
    move-object/from16 v20, v6

    .line 1184
    .line 1185
    iget-object v6, v9, Lqr5;->a:Lul;

    .line 1186
    .line 1187
    if-eqz v14, :cond_44

    .line 1188
    .line 1189
    :cond_43
    :goto_1e
    move-object/from16 v6, v20

    .line 1190
    .line 1191
    goto :goto_1d

    .line 1192
    :cond_44
    if-ne v13, v9, :cond_45

    .line 1193
    .line 1194
    goto :goto_1e

    .line 1195
    :cond_45
    invoke-virtual {v6}, Lvj8;->N()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v9

    .line 1199
    invoke-virtual {v2, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v9

    .line 1203
    if-eqz v9, :cond_47

    .line 1204
    .line 1205
    invoke-virtual {v6}, Lul;->G0()I

    .line 1206
    .line 1207
    .line 1208
    move-result v9

    .line 1209
    const/4 v14, 0x1

    .line 1210
    if-ne v9, v14, :cond_47

    .line 1211
    .line 1212
    invoke-virtual {v6}, Lvj8;->L()Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v9

    .line 1216
    const-string v14, "valueOf"

    .line 1217
    .line 1218
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v14

    .line 1222
    if-eqz v14, :cond_46

    .line 1223
    .line 1224
    goto :goto_1e

    .line 1225
    :cond_46
    const-string v14, "fromString"

    .line 1226
    .line 1227
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v9

    .line 1231
    if-eqz v9, :cond_47

    .line 1232
    .line 1233
    const/4 v9, 0x0

    .line 1234
    invoke-virtual {v6, v9}, Lul;->I0(I)Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v6

    .line 1238
    const-class v9, Ljava/lang/String;

    .line 1239
    .line 1240
    if-eq v6, v9, :cond_43

    .line 1241
    .line 1242
    const-class v9, Ljava/lang/CharSequence;

    .line 1243
    .line 1244
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v6

    .line 1248
    if-eqz v6, :cond_47

    .line 1249
    .line 1250
    goto :goto_1e

    .line 1251
    :cond_47
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->remove()V

    .line 1252
    .line 1253
    .line 1254
    goto :goto_1e

    .line 1255
    :cond_48
    if-eqz v15, :cond_4b

    .line 1256
    .line 1257
    const/4 v9, 0x0

    .line 1258
    invoke-virtual {v0, v4, v10, v3, v9}, Lpf5;->a(Lo8;Ljava/util/List;Ljava/util/LinkedHashMap;Z)V

    .line 1259
    .line 1260
    .line 1261
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1262
    .line 1263
    check-cast v2, Lqr5;

    .line 1264
    .line 1265
    if-eqz v2, :cond_49

    .line 1266
    .line 1267
    const/4 v2, 0x1

    .line 1268
    goto :goto_1f

    .line 1269
    :cond_49
    const/4 v2, 0x0

    .line 1270
    :goto_1f
    invoke-virtual {v0, v4, v11, v3, v2}, Lpf5;->a(Lo8;Ljava/util/List;Ljava/util/LinkedHashMap;Z)V

    .line 1271
    .line 1272
    .line 1273
    if-eqz v7, :cond_4b

    .line 1274
    .line 1275
    iget-boolean v2, v7, Lqr5;->b:Z

    .line 1276
    .line 1277
    if-eqz v2, :cond_4b

    .line 1278
    .line 1279
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v2, Lqr5;

    .line 1282
    .line 1283
    if-eqz v2, :cond_4a

    .line 1284
    .line 1285
    goto :goto_20

    .line 1286
    :cond_4a
    const-string v2, "explicit"

    .line 1287
    .line 1288
    const/4 v14, 0x1

    .line 1289
    invoke-virtual {v4, v5, v7, v2, v14}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 1290
    .line 1291
    .line 1292
    :cond_4b
    :goto_20
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v2, Lqr5;

    .line 1295
    .line 1296
    const-string v6, "implicit"

    .line 1297
    .line 1298
    if-eqz v2, :cond_4c

    .line 1299
    .line 1300
    goto/16 :goto_25

    .line 1301
    .line 1302
    :cond_4c
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v2

    .line 1306
    const/4 v7, 0x0

    .line 1307
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1308
    .line 1309
    .line 1310
    move-result v9

    .line 1311
    if-eqz v9, :cond_50

    .line 1312
    .line 1313
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v9

    .line 1317
    check-cast v9, Lqr5;

    .line 1318
    .line 1319
    invoke-virtual {v9, v5}, Lqr5;->b(Lvp4;)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v14, v9, Lqr5;->e:[Ljx5;

    .line 1323
    .line 1324
    array-length v14, v14

    .line 1325
    const/4 v15, 0x0

    .line 1326
    :goto_22
    if-ge v15, v14, :cond_4f

    .line 1327
    .line 1328
    move-object/from16 v20, v2

    .line 1329
    .line 1330
    iget-object v2, v9, Lqr5;->e:[Ljx5;

    .line 1331
    .line 1332
    aget-object v2, v2, v15

    .line 1333
    .line 1334
    if-eqz v2, :cond_4e

    .line 1335
    .line 1336
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->remove()V

    .line 1337
    .line 1338
    .line 1339
    if-nez v7, :cond_4d

    .line 1340
    .line 1341
    new-instance v2, Ljava/util/ArrayList;

    .line 1342
    .line 1343
    const/4 v14, 0x4

    .line 1344
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1345
    .line 1346
    .line 1347
    move-object v7, v2

    .line 1348
    goto :goto_23

    .line 1349
    :cond_4d
    const/4 v14, 0x4

    .line 1350
    :goto_23
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-object/from16 v2, v20

    .line 1354
    .line 1355
    goto :goto_21

    .line 1356
    :cond_4e
    const/16 v18, 0x4

    .line 1357
    .line 1358
    add-int/lit8 v15, v15, 0x1

    .line 1359
    .line 1360
    move-object/from16 v2, v20

    .line 1361
    .line 1362
    goto :goto_22

    .line 1363
    :cond_4f
    const/16 v18, 0x4

    .line 1364
    .line 1365
    goto :goto_21

    .line 1366
    :cond_50
    if-nez v7, :cond_51

    .line 1367
    .line 1368
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1369
    .line 1370
    :cond_51
    if-eqz v13, :cond_52

    .line 1371
    .line 1372
    invoke-interface {v7, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v2

    .line 1376
    if-eqz v2, :cond_52

    .line 1377
    .line 1378
    const/4 v9, 0x0

    .line 1379
    invoke-virtual {v4, v5, v13, v6, v9}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 1380
    .line 1381
    .line 1382
    goto :goto_25

    .line 1383
    :cond_52
    const/4 v9, 0x0

    .line 1384
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v2

    .line 1388
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1389
    .line 1390
    .line 1391
    move-result v7

    .line 1392
    if-eqz v7, :cond_53

    .line 1393
    .line 1394
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v7

    .line 1398
    check-cast v7, Lqr5;

    .line 1399
    .line 1400
    invoke-virtual {v4, v5, v7, v6, v9}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_24

    .line 1404
    :cond_53
    :goto_25
    if-eqz v13, :cond_5a

    .line 1405
    .line 1406
    invoke-interface {v10, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1407
    .line 1408
    .line 1409
    move-result v2

    .line 1410
    if-nez v2, :cond_54

    .line 1411
    .line 1412
    invoke-interface {v11, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v2

    .line 1416
    if-eqz v2, :cond_5a

    .line 1417
    .line 1418
    :cond_54
    iget-object v2, v13, Lqr5;->c:Lnn3;

    .line 1419
    .line 1420
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1421
    .line 1422
    .line 1423
    move-result v2

    .line 1424
    const/4 v14, 0x1

    .line 1425
    if-eq v2, v14, :cond_57

    .line 1426
    .line 1427
    const/4 v7, 0x2

    .line 1428
    if-eq v2, v7, :cond_55

    .line 1429
    .line 1430
    const/4 v7, 0x3

    .line 1431
    if-eq v2, v7, :cond_55

    .line 1432
    .line 1433
    iget-object v2, v13, Lqr5;->a:Lul;

    .line 1434
    .line 1435
    invoke-virtual {v2}, Lul;->G0()I

    .line 1436
    .line 1437
    .line 1438
    move-result v2

    .line 1439
    if-ne v2, v14, :cond_55

    .line 1440
    .line 1441
    iget-object v2, v0, Lpf5;->r:Ljava/util/LinkedList;

    .line 1442
    .line 1443
    if-eqz v2, :cond_55

    .line 1444
    .line 1445
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1446
    .line 1447
    .line 1448
    move-result v2

    .line 1449
    if-nez v2, :cond_55

    .line 1450
    .line 1451
    goto :goto_26

    .line 1452
    :cond_55
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v2, Lqr5;

    .line 1455
    .line 1456
    if-eqz v2, :cond_56

    .line 1457
    .line 1458
    goto :goto_27

    .line 1459
    :cond_56
    const-string v2, "primary"

    .line 1460
    .line 1461
    const/4 v9, 0x0

    .line 1462
    invoke-virtual {v4, v5, v13, v2, v9}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 1463
    .line 1464
    .line 1465
    goto :goto_27

    .line 1466
    :cond_57
    :goto_26
    iget-object v2, v4, Lo8;->f0:Ljava/lang/Object;

    .line 1467
    .line 1468
    check-cast v2, Ljava/util/ArrayList;

    .line 1469
    .line 1470
    if-eqz v2, :cond_58

    .line 1471
    .line 1472
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    if-nez v2, :cond_58

    .line 1477
    .line 1478
    goto :goto_27

    .line 1479
    :cond_58
    iget-boolean v2, v4, Lo8;->Y:Z

    .line 1480
    .line 1481
    if-nez v2, :cond_5a

    .line 1482
    .line 1483
    iget-object v2, v4, Lo8;->f0:Ljava/lang/Object;

    .line 1484
    .line 1485
    check-cast v2, Ljava/util/ArrayList;

    .line 1486
    .line 1487
    if-nez v2, :cond_59

    .line 1488
    .line 1489
    new-instance v2, Ljava/util/ArrayList;

    .line 1490
    .line 1491
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1492
    .line 1493
    .line 1494
    iput-object v2, v4, Lo8;->f0:Ljava/lang/Object;

    .line 1495
    .line 1496
    :cond_59
    invoke-interface {v2, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1497
    .line 1498
    .line 1499
    :cond_5a
    :goto_27
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1500
    .line 1501
    check-cast v2, Lqr5;

    .line 1502
    .line 1503
    if-nez v2, :cond_64

    .line 1504
    .line 1505
    iget-object v2, v4, Lo8;->f0:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v2, Ljava/util/ArrayList;

    .line 1508
    .line 1509
    if-eqz v2, :cond_5b

    .line 1510
    .line 1511
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1512
    .line 1513
    .line 1514
    move-result v2

    .line 1515
    if-nez v2, :cond_5b

    .line 1516
    .line 1517
    goto/16 :goto_2a

    .line 1518
    .line 1519
    :cond_5b
    invoke-virtual {v1}, Lal;->z0()Llr;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    iget-object v2, v2, Llr;->Y:Ljava/lang/Object;

    .line 1524
    .line 1525
    check-cast v2, Lcl;

    .line 1526
    .line 1527
    if-eqz v2, :cond_5c

    .line 1528
    .line 1529
    goto/16 :goto_2a

    .line 1530
    .line 1531
    :cond_5c
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1532
    .line 1533
    .line 1534
    move-result v2

    .line 1535
    const/4 v14, 0x1

    .line 1536
    if-eq v2, v14, :cond_5d

    .line 1537
    .line 1538
    goto :goto_2a

    .line 1539
    :cond_5d
    const/4 v9, 0x0

    .line 1540
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v2

    .line 1544
    check-cast v2, Lqr5;

    .line 1545
    .line 1546
    iget-object v7, v2, Lqr5;->a:Lul;

    .line 1547
    .line 1548
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v7}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v9

    .line 1555
    iget-object v13, v8, Lhz8;->f0:Lhn3;

    .line 1556
    .line 1557
    invoke-virtual {v13, v9}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v9

    .line 1561
    if-nez v9, :cond_5e

    .line 1562
    .line 1563
    goto :goto_2a

    .line 1564
    :cond_5e
    invoke-virtual {v2, v5}, Lqr5;->b(Lvp4;)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v7}, Lul;->G0()I

    .line 1568
    .line 1569
    .line 1570
    move-result v9

    .line 1571
    const/4 v14, 0x1

    .line 1572
    if-eq v9, v14, :cond_60

    .line 1573
    .line 1574
    invoke-virtual {v2, v5}, Lqr5;->a(Ll37;)Z

    .line 1575
    .line 1576
    .line 1577
    move-result v7

    .line 1578
    if-nez v7, :cond_5f

    .line 1579
    .line 1580
    goto :goto_2a

    .line 1581
    :cond_5f
    const/4 v9, 0x0

    .line 1582
    goto :goto_29

    .line 1583
    :cond_60
    const/4 v9, 0x0

    .line 1584
    if-eqz v12, :cond_61

    .line 1585
    .line 1586
    invoke-virtual {v7, v9}, Lul;->F0(I)Lll;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v7

    .line 1590
    invoke-virtual {v12, v7}, Lm85;->i(Lgl;)Ljj3;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v7

    .line 1594
    if-eqz v7, :cond_61

    .line 1595
    .line 1596
    goto :goto_29

    .line 1597
    :cond_61
    iget-object v7, v2, Lqr5;->d:[Ljx5;

    .line 1598
    .line 1599
    aget-object v7, v7, v9

    .line 1600
    .line 1601
    if-nez v7, :cond_62

    .line 1602
    .line 1603
    const/4 v7, 0x0

    .line 1604
    goto :goto_28

    .line 1605
    :cond_62
    iget-object v7, v7, Ljx5;->X:Ljava/lang/String;

    .line 1606
    .line 1607
    :goto_28
    if-nez v7, :cond_63

    .line 1608
    .line 1609
    goto :goto_2a

    .line 1610
    :cond_63
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v7

    .line 1614
    check-cast v7, Lrf5;

    .line 1615
    .line 1616
    if-eqz v7, :cond_64

    .line 1617
    .line 1618
    invoke-virtual {v7}, Lrf5;->F()Z

    .line 1619
    .line 1620
    .line 1621
    move-result v9

    .line 1622
    if-eqz v9, :cond_64

    .line 1623
    .line 1624
    invoke-virtual {v7}, Lrf5;->E()Z

    .line 1625
    .line 1626
    .line 1627
    move-result v7

    .line 1628
    if-eqz v7, :cond_5f

    .line 1629
    .line 1630
    goto :goto_2a

    .line 1631
    :goto_29
    invoke-interface {v10, v9}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v4, v5, v2, v6, v9}, Lo8;->c(Lvp4;Lqr5;Ljava/lang/String;Z)V

    .line 1635
    .line 1636
    .line 1637
    :cond_64
    :goto_2a
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v2

    .line 1641
    :cond_65
    :goto_2b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v6

    .line 1645
    if-eqz v6, :cond_66

    .line 1646
    .line 1647
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v6

    .line 1651
    check-cast v6, Lqr5;

    .line 1652
    .line 1653
    iget-object v6, v6, Lqr5;->a:Lul;

    .line 1654
    .line 1655
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v6}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v6

    .line 1662
    iget-object v7, v8, Lhz8;->f0:Lhn3;

    .line 1663
    .line 1664
    invoke-virtual {v7, v6}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 1665
    .line 1666
    .line 1667
    move-result v6

    .line 1668
    if-nez v6, :cond_65

    .line 1669
    .line 1670
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1671
    .line 1672
    .line 1673
    goto :goto_2b

    .line 1674
    :cond_66
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    :cond_67
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1679
    .line 1680
    .line 1681
    move-result v6

    .line 1682
    if-eqz v6, :cond_68

    .line 1683
    .line 1684
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v6

    .line 1688
    check-cast v6, Lqr5;

    .line 1689
    .line 1690
    iget-object v6, v6, Lqr5;->a:Lul;

    .line 1691
    .line 1692
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v6}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v6

    .line 1699
    iget-object v7, v8, Lhz8;->f0:Lhn3;

    .line 1700
    .line 1701
    invoke-virtual {v7, v6}, Lhn3;->a(Ljava/lang/reflect/Member;)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v6

    .line 1705
    if-nez v6, :cond_67

    .line 1706
    .line 1707
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1708
    .line 1709
    .line 1710
    goto :goto_2c

    .line 1711
    :cond_68
    iget-object v2, v4, Lo8;->Z:Ljava/lang/Object;

    .line 1712
    .line 1713
    check-cast v2, Lqr5;

    .line 1714
    .line 1715
    if-nez v2, :cond_69

    .line 1716
    .line 1717
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1718
    .line 1719
    iput-object v2, v0, Lpf5;->k:Ljava/util/List;

    .line 1720
    .line 1721
    goto/16 :goto_32

    .line 1722
    .line 1723
    :cond_69
    iget-object v4, v2, Lqr5;->a:Lul;

    .line 1724
    .line 1725
    new-instance v6, Ljava/util/ArrayList;

    .line 1726
    .line 1727
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1728
    .line 1729
    .line 1730
    iput-object v6, v0, Lpf5;->k:Ljava/util/List;

    .line 1731
    .line 1732
    invoke-virtual {v4}, Lul;->G0()I

    .line 1733
    .line 1734
    .line 1735
    move-result v7

    .line 1736
    const/4 v8, 0x0

    .line 1737
    :goto_2d
    if-ge v8, v7, :cond_70

    .line 1738
    .line 1739
    invoke-virtual {v4, v8}, Lul;->F0(I)Lll;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v9

    .line 1743
    iget-object v10, v2, Lqr5;->e:[Ljx5;

    .line 1744
    .line 1745
    aget-object v10, v10, v8

    .line 1746
    .line 1747
    iget-object v11, v2, Lqr5;->d:[Ljx5;

    .line 1748
    .line 1749
    aget-object v11, v11, v8

    .line 1750
    .line 1751
    if-eqz v10, :cond_6a

    .line 1752
    .line 1753
    const/16 v25, 0x1

    .line 1754
    .line 1755
    goto :goto_2e

    .line 1756
    :cond_6a
    const/16 v25, 0x0

    .line 1757
    .line 1758
    :goto_2e
    if-nez v25, :cond_6c

    .line 1759
    .line 1760
    if-nez v11, :cond_6c

    .line 1761
    .line 1762
    invoke-virtual {v12, v9}, Lm85;->M(Lgl;)Lc25;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v10

    .line 1766
    if-eqz v10, :cond_6b

    .line 1767
    .line 1768
    iget v10, v9, Lll;->F0:I

    .line 1769
    .line 1770
    new-instance v11, Ljx5;

    .line 1771
    .line 1772
    const-string v13, "@JsonUnwrapped/"

    .line 1773
    .line 1774
    invoke-static {v10, v13}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v10

    .line 1778
    const/4 v13, 0x0

    .line 1779
    invoke-direct {v11, v10, v13}, Ljx5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    invoke-virtual {v0, v3, v11}, Lpf5;->e(Ljava/util/LinkedHashMap;Ljx5;)Lrf5;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v10

    .line 1786
    new-instance v21, Ljp;

    .line 1787
    .line 1788
    iget-object v13, v10, Lrf5;->i0:Ljp;

    .line 1789
    .line 1790
    const/16 v25, 0x0

    .line 1791
    .line 1792
    const/16 v26, 0x1

    .line 1793
    .line 1794
    const/16 v27, 0x0

    .line 1795
    .line 1796
    move-object/from16 v22, v9

    .line 1797
    .line 1798
    move-object/from16 v24, v11

    .line 1799
    .line 1800
    move-object/from16 v23, v13

    .line 1801
    .line 1802
    invoke-direct/range {v21 .. v27}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 1803
    .line 1804
    .line 1805
    move-object/from16 v9, v21

    .line 1806
    .line 1807
    iput-object v9, v10, Lrf5;->i0:Ljp;

    .line 1808
    .line 1809
    goto :goto_31

    .line 1810
    :cond_6b
    const/4 v10, 0x0

    .line 1811
    goto :goto_31

    .line 1812
    :cond_6c
    move-object/from16 v22, v9

    .line 1813
    .line 1814
    if-eqz v11, :cond_6d

    .line 1815
    .line 1816
    iget-object v9, v11, Ljx5;->X:Ljava/lang/String;

    .line 1817
    .line 1818
    invoke-virtual {v0, v9}, Lpf5;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v9

    .line 1822
    invoke-static {v9}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v11

    .line 1826
    :cond_6d
    if-nez v11, :cond_6e

    .line 1827
    .line 1828
    invoke-virtual {v0, v3, v10}, Lpf5;->e(Ljava/util/LinkedHashMap;Ljx5;)Lrf5;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v9

    .line 1832
    goto :goto_2f

    .line 1833
    :cond_6e
    invoke-virtual {v0, v3, v11}, Lpf5;->e(Ljava/util/LinkedHashMap;Ljx5;)Lrf5;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v9

    .line 1837
    :goto_2f
    if-eqz v25, :cond_6f

    .line 1838
    .line 1839
    move-object/from16 v24, v10

    .line 1840
    .line 1841
    goto :goto_30

    .line 1842
    :cond_6f
    move-object/from16 v24, v11

    .line 1843
    .line 1844
    :goto_30
    new-instance v21, Ljp;

    .line 1845
    .line 1846
    iget-object v10, v9, Lrf5;->i0:Ljp;

    .line 1847
    .line 1848
    const/16 v26, 0x1

    .line 1849
    .line 1850
    const/16 v27, 0x0

    .line 1851
    .line 1852
    move-object/from16 v23, v10

    .line 1853
    .line 1854
    invoke-direct/range {v21 .. v27}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 1855
    .line 1856
    .line 1857
    move-object/from16 v10, v21

    .line 1858
    .line 1859
    iput-object v10, v9, Lrf5;->i0:Ljp;

    .line 1860
    .line 1861
    move-object v10, v9

    .line 1862
    :goto_31
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1863
    .line 1864
    .line 1865
    add-int/lit8 v8, v8, 0x1

    .line 1866
    .line 1867
    goto/16 :goto_2d

    .line 1868
    .line 1869
    :cond_70
    :goto_32
    sget-object v2, Lxp4;->C0:Lxp4;

    .line 1870
    .line 1871
    invoke-virtual {v5, v2}, Lvp4;->f(Lxp4;)Z

    .line 1872
    .line 1873
    .line 1874
    move-result v2

    .line 1875
    if-eqz v2, :cond_80

    .line 1876
    .line 1877
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v2

    .line 1885
    const/4 v4, 0x0

    .line 1886
    :cond_71
    :goto_33
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1887
    .line 1888
    .line 1889
    move-result v6

    .line 1890
    if-eqz v6, :cond_7b

    .line 1891
    .line 1892
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v6

    .line 1896
    check-cast v6, Ljava/util/Map$Entry;

    .line 1897
    .line 1898
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v7

    .line 1902
    check-cast v7, Lrf5;

    .line 1903
    .line 1904
    iget-object v8, v7, Lrf5;->h0:Ljp;

    .line 1905
    .line 1906
    invoke-static {v8}, Lrf5;->q(Ljp;)Z

    .line 1907
    .line 1908
    .line 1909
    move-result v8

    .line 1910
    if-nez v8, :cond_73

    .line 1911
    .line 1912
    iget-object v8, v7, Lrf5;->j0:Ljp;

    .line 1913
    .line 1914
    invoke-static {v8}, Lrf5;->q(Ljp;)Z

    .line 1915
    .line 1916
    .line 1917
    move-result v8

    .line 1918
    if-nez v8, :cond_73

    .line 1919
    .line 1920
    iget-object v8, v7, Lrf5;->k0:Ljp;

    .line 1921
    .line 1922
    invoke-static {v8}, Lrf5;->q(Ljp;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v8

    .line 1926
    if-nez v8, :cond_73

    .line 1927
    .line 1928
    iget-object v8, v7, Lrf5;->i0:Ljp;

    .line 1929
    .line 1930
    invoke-static {v8}, Lrf5;->q(Ljp;)Z

    .line 1931
    .line 1932
    .line 1933
    move-result v8

    .line 1934
    if-eqz v8, :cond_72

    .line 1935
    .line 1936
    goto :goto_34

    .line 1937
    :cond_72
    const/4 v8, 0x0

    .line 1938
    goto :goto_35

    .line 1939
    :cond_73
    :goto_34
    const/4 v8, 0x1

    .line 1940
    :goto_35
    if-nez v8, :cond_71

    .line 1941
    .line 1942
    iget-object v8, v7, Lrf5;->h0:Ljp;

    .line 1943
    .line 1944
    if-eqz v8, :cond_74

    .line 1945
    .line 1946
    goto :goto_37

    .line 1947
    :cond_74
    iget-object v8, v7, Lrf5;->i0:Ljp;

    .line 1948
    .line 1949
    if-eqz v8, :cond_75

    .line 1950
    .line 1951
    const/4 v8, 0x1

    .line 1952
    goto :goto_36

    .line 1953
    :cond_75
    const/4 v8, 0x0

    .line 1954
    :goto_36
    if-eqz v8, :cond_71

    .line 1955
    .line 1956
    :goto_37
    iget-object v8, v7, Lrf5;->j0:Ljp;

    .line 1957
    .line 1958
    if-eqz v8, :cond_76

    .line 1959
    .line 1960
    const/4 v8, 0x1

    .line 1961
    goto :goto_38

    .line 1962
    :cond_76
    const/4 v8, 0x0

    .line 1963
    :goto_38
    if-nez v8, :cond_71

    .line 1964
    .line 1965
    iget-object v8, v7, Lrf5;->k0:Ljp;

    .line 1966
    .line 1967
    if-eqz v8, :cond_77

    .line 1968
    .line 1969
    const/4 v8, 0x1

    .line 1970
    goto :goto_39

    .line 1971
    :cond_77
    const/4 v8, 0x0

    .line 1972
    :goto_39
    if-eqz v8, :cond_78

    .line 1973
    .line 1974
    goto :goto_33

    .line 1975
    :cond_78
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v8

    .line 1979
    check-cast v8, Ljava/lang/String;

    .line 1980
    .line 1981
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1982
    .line 1983
    .line 1984
    move-result v9

    .line 1985
    if-eqz v9, :cond_71

    .line 1986
    .line 1987
    const/4 v14, 0x1

    .line 1988
    if-eq v9, v14, :cond_79

    .line 1989
    .line 1990
    invoke-virtual {v8, v14}, Ljava/lang/String;->charAt(I)C

    .line 1991
    .line 1992
    .line 1993
    move-result v9

    .line 1994
    invoke-static {v9}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 1995
    .line 1996
    .line 1997
    move-result v9

    .line 1998
    if-nez v9, :cond_79

    .line 1999
    .line 2000
    goto :goto_3a

    .line 2001
    :cond_79
    const/4 v9, 0x0

    .line 2002
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 2003
    .line 2004
    .line 2005
    move-result v8

    .line 2006
    invoke-static {v8}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 2007
    .line 2008
    .line 2009
    move-result v8

    .line 2010
    if-nez v8, :cond_71

    .line 2011
    .line 2012
    :goto_3a
    if-nez v4, :cond_7a

    .line 2013
    .line 2014
    new-instance v4, Ljava/util/HashMap;

    .line 2015
    .line 2016
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2017
    .line 2018
    .line 2019
    :cond_7a
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v6

    .line 2023
    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2024
    .line 2025
    .line 2026
    goto/16 :goto_33

    .line 2027
    .line 2028
    :cond_7b
    if-nez v4, :cond_7c

    .line 2029
    .line 2030
    goto :goto_3d

    .line 2031
    :cond_7c
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v2

    .line 2035
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v2

    .line 2039
    :cond_7d
    :goto_3b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v4

    .line 2043
    if-eqz v4, :cond_80

    .line 2044
    .line 2045
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v4

    .line 2049
    check-cast v4, Ljava/util/Map$Entry;

    .line 2050
    .line 2051
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v6

    .line 2055
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v6

    .line 2059
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v7

    .line 2063
    check-cast v7, Lrf5;

    .line 2064
    .line 2065
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v4

    .line 2069
    check-cast v4, Ljava/lang/String;

    .line 2070
    .line 2071
    :cond_7e
    :goto_3c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2072
    .line 2073
    .line 2074
    move-result v8

    .line 2075
    if-eqz v8, :cond_7d

    .line 2076
    .line 2077
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v8

    .line 2081
    check-cast v8, Ljava/util/Map$Entry;

    .line 2082
    .line 2083
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v9

    .line 2087
    check-cast v9, Lrf5;

    .line 2088
    .line 2089
    if-eq v9, v7, :cond_7e

    .line 2090
    .line 2091
    iget-object v10, v9, Lrf5;->h0:Ljp;

    .line 2092
    .line 2093
    if-eqz v10, :cond_7f

    .line 2094
    .line 2095
    goto :goto_3c

    .line 2096
    :cond_7f
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v8

    .line 2100
    check-cast v8, Ljava/lang/String;

    .line 2101
    .line 2102
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2103
    .line 2104
    .line 2105
    move-result v8

    .line 2106
    if-eqz v8, :cond_7e

    .line 2107
    .line 2108
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 2109
    .line 2110
    .line 2111
    invoke-virtual {v7, v9}, Lrf5;->D(Lrf5;)V

    .line 2112
    .line 2113
    .line 2114
    goto :goto_3b

    .line 2115
    :cond_80
    :goto_3d
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v2

    .line 2119
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v2

    .line 2123
    :cond_81
    :goto_3e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2124
    .line 2125
    .line 2126
    move-result v4

    .line 2127
    if-eqz v4, :cond_8b

    .line 2128
    .line 2129
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v4

    .line 2133
    check-cast v4, Lrf5;

    .line 2134
    .line 2135
    invoke-virtual {v4}, Lrf5;->F()Z

    .line 2136
    .line 2137
    .line 2138
    move-result v6

    .line 2139
    if-nez v6, :cond_82

    .line 2140
    .line 2141
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 2142
    .line 2143
    .line 2144
    goto :goto_3e

    .line 2145
    :cond_82
    invoke-virtual {v4}, Lrf5;->E()Z

    .line 2146
    .line 2147
    .line 2148
    move-result v6

    .line 2149
    if-eqz v6, :cond_81

    .line 2150
    .line 2151
    iget-object v6, v4, Lrf5;->h0:Ljp;

    .line 2152
    .line 2153
    invoke-static {v6}, Lrf5;->s(Ljp;)Z

    .line 2154
    .line 2155
    .line 2156
    move-result v6

    .line 2157
    if-nez v6, :cond_85

    .line 2158
    .line 2159
    iget-object v6, v4, Lrf5;->j0:Ljp;

    .line 2160
    .line 2161
    invoke-static {v6}, Lrf5;->s(Ljp;)Z

    .line 2162
    .line 2163
    .line 2164
    move-result v6

    .line 2165
    if-nez v6, :cond_85

    .line 2166
    .line 2167
    iget-object v6, v4, Lrf5;->k0:Ljp;

    .line 2168
    .line 2169
    invoke-static {v6}, Lrf5;->s(Ljp;)Z

    .line 2170
    .line 2171
    .line 2172
    move-result v6

    .line 2173
    if-nez v6, :cond_85

    .line 2174
    .line 2175
    iget-object v6, v4, Lrf5;->i0:Ljp;

    .line 2176
    .line 2177
    :goto_3f
    if-eqz v6, :cond_84

    .line 2178
    .line 2179
    iget-boolean v7, v6, Ljp;->f:Z

    .line 2180
    .line 2181
    if-nez v7, :cond_83

    .line 2182
    .line 2183
    iget-object v7, v6, Ljp;->c:Ljava/io/Serializable;

    .line 2184
    .line 2185
    check-cast v7, Ljx5;

    .line 2186
    .line 2187
    if-eqz v7, :cond_83

    .line 2188
    .line 2189
    iget-boolean v7, v6, Ljp;->d:Z

    .line 2190
    .line 2191
    if-eqz v7, :cond_83

    .line 2192
    .line 2193
    goto :goto_40

    .line 2194
    :cond_83
    iget-object v6, v6, Ljp;->b:Ljava/lang/Object;

    .line 2195
    .line 2196
    check-cast v6, Ljp;

    .line 2197
    .line 2198
    goto :goto_3f

    .line 2199
    :cond_84
    const/4 v6, 0x0

    .line 2200
    goto :goto_41

    .line 2201
    :cond_85
    :goto_40
    const/4 v6, 0x1

    .line 2202
    :goto_41
    if-nez v6, :cond_86

    .line 2203
    .line 2204
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 2205
    .line 2206
    .line 2207
    invoke-virtual {v4}, Lrf5;->j()Ljava/lang/String;

    .line 2208
    .line 2209
    .line 2210
    goto :goto_3e

    .line 2211
    :cond_86
    iget-object v6, v4, Lrf5;->h0:Ljp;

    .line 2212
    .line 2213
    if-nez v6, :cond_87

    .line 2214
    .line 2215
    goto :goto_42

    .line 2216
    :cond_87
    invoke-virtual {v6}, Ljp;->g()Ljp;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v6

    .line 2220
    :goto_42
    iput-object v6, v4, Lrf5;->h0:Ljp;

    .line 2221
    .line 2222
    iget-object v6, v4, Lrf5;->j0:Ljp;

    .line 2223
    .line 2224
    if-nez v6, :cond_88

    .line 2225
    .line 2226
    goto :goto_43

    .line 2227
    :cond_88
    invoke-virtual {v6}, Ljp;->g()Ljp;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v6

    .line 2231
    :goto_43
    iput-object v6, v4, Lrf5;->j0:Ljp;

    .line 2232
    .line 2233
    iget-object v6, v4, Lrf5;->k0:Ljp;

    .line 2234
    .line 2235
    if-nez v6, :cond_89

    .line 2236
    .line 2237
    goto :goto_44

    .line 2238
    :cond_89
    invoke-virtual {v6}, Ljp;->g()Ljp;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v6

    .line 2242
    :goto_44
    iput-object v6, v4, Lrf5;->k0:Ljp;

    .line 2243
    .line 2244
    iget-object v6, v4, Lrf5;->i0:Ljp;

    .line 2245
    .line 2246
    if-nez v6, :cond_8a

    .line 2247
    .line 2248
    goto :goto_45

    .line 2249
    :cond_8a
    invoke-virtual {v6}, Ljp;->g()Ljp;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v6

    .line 2253
    :goto_45
    iput-object v6, v4, Lrf5;->i0:Ljp;

    .line 2254
    .line 2255
    invoke-virtual {v4}, Lrf5;->a()Z

    .line 2256
    .line 2257
    .line 2258
    move-result v6

    .line 2259
    if-nez v6, :cond_81

    .line 2260
    .line 2261
    invoke-virtual {v4}, Lrf5;->j()Ljava/lang/String;

    .line 2262
    .line 2263
    .line 2264
    goto/16 :goto_3e

    .line 2265
    .line 2266
    :cond_8b
    sget-object v2, Lxp4;->m0:Lxp4;

    .line 2267
    .line 2268
    invoke-virtual {v5, v2}, Lvp4;->f(Lxp4;)Z

    .line 2269
    .line 2270
    .line 2271
    move-result v2

    .line 2272
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v4

    .line 2276
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v4

    .line 2280
    :cond_8c
    :goto_46
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2281
    .line 2282
    .line 2283
    move-result v6

    .line 2284
    if-eqz v6, :cond_9c

    .line 2285
    .line 2286
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v6

    .line 2290
    check-cast v6, Lrf5;

    .line 2291
    .line 2292
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2293
    .line 2294
    .line 2295
    iget-object v7, v6, Lrf5;->Z:Lm85;

    .line 2296
    .line 2297
    sget-object v8, Lmq3;->X:Lmq3;

    .line 2298
    .line 2299
    if-nez v7, :cond_8e

    .line 2300
    .line 2301
    :cond_8d
    const/4 v9, 0x0

    .line 2302
    goto :goto_47

    .line 2303
    :cond_8e
    iget-object v9, v6, Lrf5;->j0:Ljp;

    .line 2304
    .line 2305
    if-eqz v9, :cond_8f

    .line 2306
    .line 2307
    iget-object v9, v9, Ljp;->g:Ljava/lang/Object;

    .line 2308
    .line 2309
    check-cast v9, Lgl;

    .line 2310
    .line 2311
    invoke-virtual {v7, v9}, Lm85;->r(Lvj8;)Lmq3;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v9

    .line 2315
    if-eqz v9, :cond_8f

    .line 2316
    .line 2317
    if-eq v9, v8, :cond_8f

    .line 2318
    .line 2319
    goto :goto_47

    .line 2320
    :cond_8f
    iget-object v9, v6, Lrf5;->h0:Ljp;

    .line 2321
    .line 2322
    if-eqz v9, :cond_90

    .line 2323
    .line 2324
    iget-object v9, v9, Ljp;->g:Ljava/lang/Object;

    .line 2325
    .line 2326
    check-cast v9, Lgl;

    .line 2327
    .line 2328
    invoke-virtual {v7, v9}, Lm85;->r(Lvj8;)Lmq3;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v9

    .line 2332
    if-eqz v9, :cond_90

    .line 2333
    .line 2334
    if-eq v9, v8, :cond_90

    .line 2335
    .line 2336
    goto :goto_47

    .line 2337
    :cond_90
    iget-object v9, v6, Lrf5;->i0:Ljp;

    .line 2338
    .line 2339
    if-eqz v9, :cond_91

    .line 2340
    .line 2341
    iget-object v9, v9, Ljp;->g:Ljava/lang/Object;

    .line 2342
    .line 2343
    check-cast v9, Lgl;

    .line 2344
    .line 2345
    invoke-virtual {v7, v9}, Lm85;->r(Lvj8;)Lmq3;

    .line 2346
    .line 2347
    .line 2348
    move-result-object v9

    .line 2349
    if-eqz v9, :cond_91

    .line 2350
    .line 2351
    if-eq v9, v8, :cond_91

    .line 2352
    .line 2353
    goto :goto_47

    .line 2354
    :cond_91
    iget-object v9, v6, Lrf5;->k0:Ljp;

    .line 2355
    .line 2356
    if-eqz v9, :cond_8d

    .line 2357
    .line 2358
    iget-object v9, v9, Ljp;->g:Ljava/lang/Object;

    .line 2359
    .line 2360
    check-cast v9, Lgl;

    .line 2361
    .line 2362
    invoke-virtual {v7, v9}, Lm85;->r(Lvj8;)Lmq3;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v7

    .line 2366
    if-eqz v7, :cond_8d

    .line 2367
    .line 2368
    if-eq v7, v8, :cond_8d

    .line 2369
    .line 2370
    move-object v9, v7

    .line 2371
    :goto_47
    iget-object v7, v6, Lrf5;->Y:Ll37;

    .line 2372
    .line 2373
    sget-object v10, Lxp4;->s0:Lxp4;

    .line 2374
    .line 2375
    invoke-virtual {v7, v10}, Lvp4;->f(Lxp4;)Z

    .line 2376
    .line 2377
    .line 2378
    move-result v7

    .line 2379
    if-eqz v7, :cond_93

    .line 2380
    .line 2381
    sget-object v7, Lmq3;->Z:Lmq3;

    .line 2382
    .line 2383
    sget-object v10, Lmq3;->Y:Lmq3;

    .line 2384
    .line 2385
    if-ne v9, v10, :cond_92

    .line 2386
    .line 2387
    move-object v9, v7

    .line 2388
    goto :goto_48

    .line 2389
    :cond_92
    if-ne v9, v7, :cond_93

    .line 2390
    .line 2391
    move-object v9, v10

    .line 2392
    :cond_93
    :goto_48
    if-nez v9, :cond_94

    .line 2393
    .line 2394
    goto :goto_49

    .line 2395
    :cond_94
    move-object v8, v9

    .line 2396
    :goto_49
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 2397
    .line 2398
    .line 2399
    move-result v7

    .line 2400
    const/4 v14, 0x1

    .line 2401
    if-eq v7, v14, :cond_9b

    .line 2402
    .line 2403
    const/4 v8, 0x2

    .line 2404
    if-eq v7, v8, :cond_9a

    .line 2405
    .line 2406
    const/4 v9, 0x3

    .line 2407
    if-eq v7, v9, :cond_8c

    .line 2408
    .line 2409
    iget-object v7, v6, Lrf5;->j0:Ljp;

    .line 2410
    .line 2411
    if-nez v7, :cond_95

    .line 2412
    .line 2413
    goto :goto_4a

    .line 2414
    :cond_95
    invoke-virtual {v7}, Ljp;->i()Ljp;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v7

    .line 2418
    :goto_4a
    iput-object v7, v6, Lrf5;->j0:Ljp;

    .line 2419
    .line 2420
    iget-object v7, v6, Lrf5;->i0:Ljp;

    .line 2421
    .line 2422
    if-nez v7, :cond_96

    .line 2423
    .line 2424
    goto :goto_4b

    .line 2425
    :cond_96
    invoke-virtual {v7}, Ljp;->i()Ljp;

    .line 2426
    .line 2427
    .line 2428
    move-result-object v7

    .line 2429
    :goto_4b
    iput-object v7, v6, Lrf5;->i0:Ljp;

    .line 2430
    .line 2431
    if-eqz v2, :cond_97

    .line 2432
    .line 2433
    iget-object v7, v6, Lrf5;->j0:Ljp;

    .line 2434
    .line 2435
    if-nez v7, :cond_8c

    .line 2436
    .line 2437
    :cond_97
    iget-object v7, v6, Lrf5;->h0:Ljp;

    .line 2438
    .line 2439
    if-nez v7, :cond_98

    .line 2440
    .line 2441
    goto :goto_4c

    .line 2442
    :cond_98
    invoke-virtual {v7}, Ljp;->i()Ljp;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v7

    .line 2446
    :goto_4c
    iput-object v7, v6, Lrf5;->h0:Ljp;

    .line 2447
    .line 2448
    iget-object v7, v6, Lrf5;->k0:Ljp;

    .line 2449
    .line 2450
    if-nez v7, :cond_99

    .line 2451
    .line 2452
    goto :goto_4d

    .line 2453
    :cond_99
    invoke-virtual {v7}, Ljp;->i()Ljp;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v7

    .line 2457
    :goto_4d
    iput-object v7, v6, Lrf5;->k0:Ljp;

    .line 2458
    .line 2459
    goto/16 :goto_46

    .line 2460
    .line 2461
    :cond_9a
    const/4 v9, 0x3

    .line 2462
    const/4 v13, 0x0

    .line 2463
    iput-object v13, v6, Lrf5;->j0:Ljp;

    .line 2464
    .line 2465
    iput-object v13, v6, Lrf5;->h0:Ljp;

    .line 2466
    .line 2467
    goto/16 :goto_46

    .line 2468
    .line 2469
    :cond_9b
    const/4 v8, 0x2

    .line 2470
    const/4 v9, 0x3

    .line 2471
    const/4 v13, 0x0

    .line 2472
    iput-object v13, v6, Lrf5;->k0:Ljp;

    .line 2473
    .line 2474
    iput-object v13, v6, Lrf5;->i0:Ljp;

    .line 2475
    .line 2476
    goto/16 :goto_46

    .line 2477
    .line 2478
    :cond_9c
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v2

    .line 2482
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v2

    .line 2486
    const/4 v9, 0x0

    .line 2487
    :goto_4e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2488
    .line 2489
    .line 2490
    move-result v4

    .line 2491
    if-eqz v4, :cond_a1

    .line 2492
    .line 2493
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v4

    .line 2497
    check-cast v4, Ljava/util/Map$Entry;

    .line 2498
    .line 2499
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v4

    .line 2503
    check-cast v4, Lrf5;

    .line 2504
    .line 2505
    iget-object v6, v4, Lrf5;->h0:Ljp;

    .line 2506
    .line 2507
    const/4 v13, 0x0

    .line 2508
    invoke-static {v6, v13}, Lrf5;->x(Ljp;Ljava/util/Set;)Ljava/util/Set;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v6

    .line 2512
    iget-object v7, v4, Lrf5;->j0:Ljp;

    .line 2513
    .line 2514
    invoke-static {v7, v6}, Lrf5;->x(Ljp;Ljava/util/Set;)Ljava/util/Set;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v6

    .line 2518
    iget-object v7, v4, Lrf5;->k0:Ljp;

    .line 2519
    .line 2520
    invoke-static {v7, v6}, Lrf5;->x(Ljp;Ljava/util/Set;)Ljava/util/Set;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v6

    .line 2524
    iget-object v7, v4, Lrf5;->i0:Ljp;

    .line 2525
    .line 2526
    invoke-static {v7, v6}, Lrf5;->x(Ljp;Ljava/util/Set;)Ljava/util/Set;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v6

    .line 2530
    if-nez v6, :cond_9d

    .line 2531
    .line 2532
    sget-object v6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2533
    .line 2534
    :cond_9d
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2535
    .line 2536
    .line 2537
    move-result v7

    .line 2538
    if-eqz v7, :cond_9e

    .line 2539
    .line 2540
    goto :goto_4e

    .line 2541
    :cond_9e
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 2542
    .line 2543
    .line 2544
    if-nez v9, :cond_9f

    .line 2545
    .line 2546
    new-instance v7, Ljava/util/LinkedList;

    .line 2547
    .line 2548
    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    .line 2549
    .line 2550
    .line 2551
    move-object v9, v7

    .line 2552
    :cond_9f
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 2553
    .line 2554
    .line 2555
    move-result v7

    .line 2556
    const/4 v14, 0x1

    .line 2557
    if-ne v7, v14, :cond_a0

    .line 2558
    .line 2559
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v6

    .line 2563
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v6

    .line 2567
    check-cast v6, Ljx5;

    .line 2568
    .line 2569
    new-instance v7, Lrf5;

    .line 2570
    .line 2571
    invoke-direct {v7, v4, v6}, Lrf5;-><init>(Lrf5;Ljx5;)V

    .line 2572
    .line 2573
    .line 2574
    invoke-virtual {v9, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 2575
    .line 2576
    .line 2577
    goto :goto_4e

    .line 2578
    :cond_a0
    new-instance v7, Ljava/util/HashMap;

    .line 2579
    .line 2580
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 2581
    .line 2582
    .line 2583
    iget-object v8, v4, Lrf5;->h0:Ljp;

    .line 2584
    .line 2585
    check-cast v6, Ljava/util/Set;

    .line 2586
    .line 2587
    invoke-virtual {v4, v6, v7, v8}, Lrf5;->w(Ljava/util/Set;Ljava/util/HashMap;Ljp;)V

    .line 2588
    .line 2589
    .line 2590
    iget-object v8, v4, Lrf5;->j0:Ljp;

    .line 2591
    .line 2592
    invoke-virtual {v4, v6, v7, v8}, Lrf5;->w(Ljava/util/Set;Ljava/util/HashMap;Ljp;)V

    .line 2593
    .line 2594
    .line 2595
    iget-object v8, v4, Lrf5;->k0:Ljp;

    .line 2596
    .line 2597
    invoke-virtual {v4, v6, v7, v8}, Lrf5;->w(Ljava/util/Set;Ljava/util/HashMap;Ljp;)V

    .line 2598
    .line 2599
    .line 2600
    iget-object v8, v4, Lrf5;->i0:Ljp;

    .line 2601
    .line 2602
    invoke-virtual {v4, v6, v7, v8}, Lrf5;->w(Ljava/util/Set;Ljava/util/HashMap;Ljp;)V

    .line 2603
    .line 2604
    .line 2605
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v4

    .line 2609
    invoke-virtual {v9, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 2610
    .line 2611
    .line 2612
    goto :goto_4e

    .line 2613
    :cond_a1
    if-eqz v9, :cond_a5

    .line 2614
    .line 2615
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 2616
    .line 2617
    .line 2618
    move-result-object v2

    .line 2619
    :cond_a2
    :goto_4f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2620
    .line 2621
    .line 2622
    move-result v4

    .line 2623
    if-eqz v4, :cond_a5

    .line 2624
    .line 2625
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2626
    .line 2627
    .line 2628
    move-result-object v4

    .line 2629
    check-cast v4, Lrf5;

    .line 2630
    .line 2631
    invoke-virtual {v4}, Lrf5;->j()Ljava/lang/String;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v6

    .line 2635
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v7

    .line 2639
    check-cast v7, Lrf5;

    .line 2640
    .line 2641
    if-nez v7, :cond_a3

    .line 2642
    .line 2643
    invoke-interface {v3, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2644
    .line 2645
    .line 2646
    goto :goto_50

    .line 2647
    :cond_a3
    invoke-virtual {v7, v4}, Lrf5;->D(Lrf5;)V

    .line 2648
    .line 2649
    .line 2650
    :goto_50
    iget-object v6, v0, Lpf5;->k:Ljava/util/List;

    .line 2651
    .line 2652
    invoke-virtual {v4}, Lrf5;->f()Lll;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v7

    .line 2656
    if-eqz v6, :cond_a2

    .line 2657
    .line 2658
    if-eqz v7, :cond_a2

    .line 2659
    .line 2660
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2661
    .line 2662
    .line 2663
    move-result v8

    .line 2664
    const/4 v9, 0x0

    .line 2665
    :goto_51
    if-ge v9, v8, :cond_a2

    .line 2666
    .line 2667
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v10

    .line 2671
    check-cast v10, Lrf5;

    .line 2672
    .line 2673
    if-eqz v10, :cond_a4

    .line 2674
    .line 2675
    invoke-virtual {v10}, Lrf5;->f()Lll;

    .line 2676
    .line 2677
    .line 2678
    move-result-object v10

    .line 2679
    if-ne v10, v7, :cond_a4

    .line 2680
    .line 2681
    invoke-interface {v6, v9, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2682
    .line 2683
    .line 2684
    goto :goto_4f

    .line 2685
    :cond_a4
    add-int/lit8 v9, v9, 0x1

    .line 2686
    .line 2687
    goto :goto_51

    .line 2688
    :cond_a5
    invoke-virtual {v1}, Lal;->A0()Ljava/util/List;

    .line 2689
    .line 2690
    .line 2691
    move-result-object v2

    .line 2692
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v2

    .line 2696
    :goto_52
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2697
    .line 2698
    .line 2699
    move-result v4

    .line 2700
    if-eqz v4, :cond_a6

    .line 2701
    .line 2702
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v4

    .line 2706
    check-cast v4, Lel;

    .line 2707
    .line 2708
    invoke-virtual {v12, v4}, Lm85;->i(Lgl;)Ljj3;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v6

    .line 2712
    invoke-virtual {v0, v6, v4}, Lpf5;->d(Ljj3;Lgl;)V

    .line 2713
    .line 2714
    .line 2715
    goto :goto_52

    .line 2716
    :cond_a6
    invoke-virtual {v1}, Lal;->B0()Lkl;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v2

    .line 2720
    invoke-virtual {v2}, Lkl;->iterator()Ljava/util/Iterator;

    .line 2721
    .line 2722
    .line 2723
    move-result-object v2

    .line 2724
    :goto_53
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2725
    .line 2726
    .line 2727
    move-result v4

    .line 2728
    if-eqz v4, :cond_a8

    .line 2729
    .line 2730
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2731
    .line 2732
    .line 2733
    move-result-object v4

    .line 2734
    check-cast v4, Lhl;

    .line 2735
    .line 2736
    invoke-virtual {v4}, Lhl;->G0()I

    .line 2737
    .line 2738
    .line 2739
    move-result v6

    .line 2740
    const/4 v14, 0x1

    .line 2741
    if-eq v6, v14, :cond_a7

    .line 2742
    .line 2743
    goto :goto_53

    .line 2744
    :cond_a7
    invoke-virtual {v12, v4}, Lm85;->i(Lgl;)Ljj3;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v6

    .line 2748
    invoke-virtual {v0, v6, v4}, Lpf5;->d(Ljj3;Lgl;)V

    .line 2749
    .line 2750
    .line 2751
    goto :goto_53

    .line 2752
    :cond_a8
    iget-object v2, v0, Lpf5;->s:Ljava/util/LinkedHashMap;

    .line 2753
    .line 2754
    if-eqz v2, :cond_ab

    .line 2755
    .line 2756
    iget-object v2, v0, Lpf5;->k:Ljava/util/List;

    .line 2757
    .line 2758
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v2

    .line 2762
    :cond_a9
    :goto_54
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2763
    .line 2764
    .line 2765
    move-result v4

    .line 2766
    if-eqz v4, :cond_ab

    .line 2767
    .line 2768
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2769
    .line 2770
    .line 2771
    move-result-object v4

    .line 2772
    check-cast v4, Lrf5;

    .line 2773
    .line 2774
    if-nez v4, :cond_aa

    .line 2775
    .line 2776
    goto :goto_54

    .line 2777
    :cond_aa
    invoke-virtual {v4}, Lrf5;->f()Lll;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v4

    .line 2781
    invoke-virtual {v12, v4}, Lm85;->i(Lgl;)Ljj3;

    .line 2782
    .line 2783
    .line 2784
    move-result-object v4

    .line 2785
    if-eqz v4, :cond_a9

    .line 2786
    .line 2787
    iget-object v6, v0, Lpf5;->s:Ljava/util/LinkedHashMap;

    .line 2788
    .line 2789
    iget-object v4, v4, Ljj3;->X:Ljava/lang/Object;

    .line 2790
    .line 2791
    invoke-virtual {v6, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2792
    .line 2793
    .line 2794
    goto :goto_54

    .line 2795
    :cond_ab
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2796
    .line 2797
    .line 2798
    move-result-object v2

    .line 2799
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2800
    .line 2801
    .line 2802
    move-result-object v2

    .line 2803
    :cond_ac
    :goto_55
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2804
    .line 2805
    .line 2806
    move-result v4

    .line 2807
    if-eqz v4, :cond_ae

    .line 2808
    .line 2809
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v4

    .line 2813
    check-cast v4, Lrf5;

    .line 2814
    .line 2815
    iget-object v6, v4, Lrf5;->j0:Ljp;

    .line 2816
    .line 2817
    iget-object v7, v4, Lrf5;->h0:Ljp;

    .line 2818
    .line 2819
    if-eqz v6, :cond_ad

    .line 2820
    .line 2821
    iget-object v8, v4, Lrf5;->i0:Ljp;

    .line 2822
    .line 2823
    iget-object v9, v4, Lrf5;->k0:Ljp;

    .line 2824
    .line 2825
    filled-new-array {v6, v7, v8, v9}, [Ljp;

    .line 2826
    .line 2827
    .line 2828
    move-result-object v6

    .line 2829
    const/4 v9, 0x0

    .line 2830
    invoke-static {v9, v6}, Lrf5;->B(I[Ljp;)Lyr2;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v6

    .line 2834
    iget-object v7, v4, Lrf5;->j0:Ljp;

    .line 2835
    .line 2836
    invoke-static {v7, v6}, Lrf5;->v(Ljp;Lyr2;)Ljp;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v6

    .line 2840
    iput-object v6, v4, Lrf5;->j0:Ljp;

    .line 2841
    .line 2842
    goto :goto_55

    .line 2843
    :cond_ad
    const/4 v9, 0x0

    .line 2844
    if-eqz v7, :cond_ac

    .line 2845
    .line 2846
    iget-object v6, v4, Lrf5;->i0:Ljp;

    .line 2847
    .line 2848
    iget-object v8, v4, Lrf5;->k0:Ljp;

    .line 2849
    .line 2850
    filled-new-array {v7, v6, v8}, [Ljp;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v6

    .line 2854
    invoke-static {v9, v6}, Lrf5;->B(I[Ljp;)Lyr2;

    .line 2855
    .line 2856
    .line 2857
    move-result-object v6

    .line 2858
    iget-object v7, v4, Lrf5;->h0:Ljp;

    .line 2859
    .line 2860
    invoke-static {v7, v6}, Lrf5;->v(Ljp;Lyr2;)Ljp;

    .line 2861
    .line 2862
    .line 2863
    move-result-object v6

    .line 2864
    iput-object v6, v4, Lrf5;->h0:Ljp;

    .line 2865
    .line 2866
    goto :goto_55

    .line 2867
    :cond_ae
    invoke-virtual {v12, v1}, Lm85;->n(Lal;)Ljava/lang/Object;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v1

    .line 2871
    if-nez v1, :cond_af

    .line 2872
    .line 2873
    goto :goto_56

    .line 2874
    :cond_af
    check-cast v1, Ljava/lang/Class;

    .line 2875
    .line 2876
    const-class v2, Lkx5;

    .line 2877
    .line 2878
    if-ne v1, v2, :cond_b0

    .line 2879
    .line 2880
    goto :goto_56

    .line 2881
    :cond_b0
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2882
    .line 2883
    .line 2884
    move-result v2

    .line 2885
    if-eqz v2, :cond_b8

    .line 2886
    .line 2887
    sget-object v2, Lxp4;->q0:Lxp4;

    .line 2888
    .line 2889
    invoke-virtual {v5, v2}, Lvp4;->f(Lxp4;)Z

    .line 2890
    .line 2891
    .line 2892
    move-result v2

    .line 2893
    invoke-static {v1, v2}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 2894
    .line 2895
    .line 2896
    move-result-object v1

    .line 2897
    invoke-static {v1}, Lp61;->x(Ljava/lang/Object;)V

    .line 2898
    .line 2899
    .line 2900
    :goto_56
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v1

    .line 2904
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v1

    .line 2908
    :goto_57
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2909
    .line 2910
    .line 2911
    move-result v2

    .line 2912
    if-eqz v2, :cond_b5

    .line 2913
    .line 2914
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v2

    .line 2918
    check-cast v2, Lrf5;

    .line 2919
    .line 2920
    iget-object v4, v2, Lrf5;->h0:Ljp;

    .line 2921
    .line 2922
    if-nez v4, :cond_b1

    .line 2923
    .line 2924
    goto :goto_58

    .line 2925
    :cond_b1
    invoke-virtual {v4}, Ljp;->e()Ljp;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v4

    .line 2929
    :goto_58
    iput-object v4, v2, Lrf5;->h0:Ljp;

    .line 2930
    .line 2931
    iget-object v4, v2, Lrf5;->j0:Ljp;

    .line 2932
    .line 2933
    if-nez v4, :cond_b2

    .line 2934
    .line 2935
    goto :goto_59

    .line 2936
    :cond_b2
    invoke-virtual {v4}, Ljp;->e()Ljp;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v4

    .line 2940
    :goto_59
    iput-object v4, v2, Lrf5;->j0:Ljp;

    .line 2941
    .line 2942
    iget-object v4, v2, Lrf5;->k0:Ljp;

    .line 2943
    .line 2944
    if-nez v4, :cond_b3

    .line 2945
    .line 2946
    goto :goto_5a

    .line 2947
    :cond_b3
    invoke-virtual {v4}, Ljp;->e()Ljp;

    .line 2948
    .line 2949
    .line 2950
    move-result-object v4

    .line 2951
    :goto_5a
    iput-object v4, v2, Lrf5;->k0:Ljp;

    .line 2952
    .line 2953
    iget-object v4, v2, Lrf5;->i0:Ljp;

    .line 2954
    .line 2955
    if-nez v4, :cond_b4

    .line 2956
    .line 2957
    goto :goto_5b

    .line 2958
    :cond_b4
    invoke-virtual {v4}, Ljp;->e()Ljp;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v4

    .line 2962
    :goto_5b
    iput-object v4, v2, Lrf5;->i0:Ljp;

    .line 2963
    .line 2964
    goto :goto_57

    .line 2965
    :cond_b5
    sget-object v1, Lxp4;->A0:Lxp4;

    .line 2966
    .line 2967
    invoke-virtual {v5, v1}, Lvp4;->f(Lxp4;)Z

    .line 2968
    .line 2969
    .line 2970
    move-result v1

    .line 2971
    if-eqz v1, :cond_b7

    .line 2972
    .line 2973
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2974
    .line 2975
    .line 2976
    move-result-object v1

    .line 2977
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v1

    .line 2981
    :goto_5c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2982
    .line 2983
    .line 2984
    move-result v2

    .line 2985
    if-eqz v2, :cond_b7

    .line 2986
    .line 2987
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2988
    .line 2989
    .line 2990
    move-result-object v2

    .line 2991
    check-cast v2, Ljava/util/Map$Entry;

    .line 2992
    .line 2993
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2994
    .line 2995
    .line 2996
    move-result-object v2

    .line 2997
    check-cast v2, Lrf5;

    .line 2998
    .line 2999
    invoke-virtual {v2}, Le50;->e()Lgl;

    .line 3000
    .line 3001
    .line 3002
    move-result-object v2

    .line 3003
    if-nez v2, :cond_b6

    .line 3004
    .line 3005
    goto :goto_5c

    .line 3006
    :cond_b6
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3007
    .line 3008
    .line 3009
    goto :goto_5c

    .line 3010
    :cond_b7
    invoke-virtual {v0, v3}, Lpf5;->h(Ljava/util/LinkedHashMap;)V

    .line 3011
    .line 3012
    .line 3013
    iput-object v3, v0, Lpf5;->j:Ljava/util/LinkedHashMap;

    .line 3014
    .line 3015
    const/4 v14, 0x1

    .line 3016
    iput-boolean v14, v0, Lpf5;->i:Z

    .line 3017
    .line 3018
    return-void

    .line 3019
    :cond_b8
    invoke-static {v1}, Lit0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v1

    .line 3023
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v1

    .line 3027
    const-string v2, "AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`"

    .line 3028
    .line 3029
    invoke-virtual {v0, v2, v1}, Lpf5;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3030
    .line 3031
    .line 3032
    const/16 v19, 0x0

    .line 3033
    .line 3034
    throw v19
.end method

.method public final varargs j(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    array-length v0, p2

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Problem with definition of "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lpf5;->d:Lal;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p0, ": "

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2
.end method
