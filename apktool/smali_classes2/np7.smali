.class public final Lnp7;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lfn6;

.field public final e:Loh7;

.field public final f:Lh76;

.field public final g:Lu77;

.field public final h:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lxw8;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lr47;

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lr47;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lvz7;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, v0, Lnp7;->b:Lvz7;

    .line 19
    .line 20
    new-instance v1, Lr47;

    .line 21
    .line 22
    const/16 v2, 0x1d

    .line 23
    .line 24
    invoke-direct {v1, v2}, Lr47;-><init>(B)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lvz7;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Lvz7;-><init>(Ldn2;)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lnp7;->c:Lvz7;

    .line 33
    .line 34
    new-instance v1, Lfn6;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v0, v2}, Lfn6;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lnp7;->d:Lfn6;

    .line 41
    .line 42
    new-instance v3, Lqn7;

    .line 43
    .line 44
    sget-object v1, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    sget-object v18, Lwv5;->a:Lwv5;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v12, 0x1

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    invoke-direct/range {v3 .. v18}, Lqn7;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZLaw5;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lnp7;->e:Loh7;

    .line 78
    .line 79
    invoke-static {v1}, Ljm4;->n(Loh7;)Lh76;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, Lnp7;->f:Lh76;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v2, 0x7

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static {v3, v2, v1}, Lv77;->b(IILl90;)Lu77;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, v0, Lnp7;->g:Lu77;

    .line 93
    .line 94
    invoke-static {v1}, Ljm4;->m(Lu77;)Lf76;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iput-object v1, v0, Lnp7;->h:Lf76;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Lj2;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnp7;->f()Lmn6;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 41
    .line 42
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p0, v3, p1}, Lmn6;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Lqg5;

    .line 55
    .line 56
    invoke-direct {v4, v2, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p0, Lec7;->Y:Lec7;

    .line 64
    .line 65
    invoke-virtual {p0}, Lec7;->c()Lqm5;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lqg5;

    .line 84
    .line 85
    iget-object v1, v0, Lqg5;->X:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 88
    .line 89
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    new-instance v2, Lum6;

    .line 98
    .line 99
    invoke-direct {v2, v1, v0}, Lum6;-><init>(Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    invoke-virtual {p0}, Lqm5;->c()Lj2;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public final f()Lmn6;
    .locals 0

    .line 1
    iget-object p0, p0, Lnp7;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmn6;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g(Lap7;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lpo7;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Lpo7;

    .line 12
    .line 13
    iget-object v1, v1, Lpo7;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v5, Lhp7;

    .line 20
    .line 21
    invoke-direct {v5, v0, v1, v4}, Lhp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v4, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lbp7;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    invoke-direct {v2, v0, v4, v5}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    instance-of v2, v1, Ljo7;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Lbp7;

    .line 51
    .line 52
    invoke-direct {v2, v0, v4, v5}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    instance-of v2, v1, Lko7;

    .line 60
    .line 61
    iget-object v6, v0, Lnp7;->e:Loh7;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move-object v7, v0

    .line 73
    check-cast v7, Lqn7;

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/16 v21, 0x0

    .line 79
    .line 80
    const/16 v22, 0x77ff

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v13, 0x0

    .line 88
    const/4 v14, 0x0

    .line 89
    const/4 v15, 0x0

    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    const/16 v18, 0x1

    .line 95
    .line 96
    const/16 v19, 0x0

    .line 97
    .line 98
    const/16 v20, 0x0

    .line 99
    .line 100
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :cond_3
    instance-of v2, v1, Lmo7;

    .line 113
    .line 114
    iget-object v7, v0, Lnp7;->f:Lh76;

    .line 115
    .line 116
    const/4 v8, 0x1

    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v2, v7, Lh76;->X:Loh7;

    .line 124
    .line 125
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lqn7;

    .line 130
    .line 131
    iget-object v2, v2, Lqn7;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v1, v2, v8}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_2b

    .line 138
    .line 139
    new-instance v2, Lvo7;

    .line 140
    .line 141
    invoke-direct {v2, v1}, Lvo7;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Lnp7;->g(Lap7;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    instance-of v2, v1, Loo7;

    .line 149
    .line 150
    if-eqz v2, :cond_5

    .line 151
    .line 152
    sget-object v1, Lss8;->a:Lss8;

    .line 153
    .line 154
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 155
    .line 156
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v1}, Lss8;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    new-instance v5, Ldp7;

    .line 169
    .line 170
    invoke-direct {v5, v0, v1, v4}, Ldp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v2, v4, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    instance-of v2, v1, Lwo7;

    .line 178
    .line 179
    if-eqz v2, :cond_9

    .line 180
    .line 181
    check-cast v1, Lwo7;

    .line 182
    .line 183
    iget-boolean v1, v1, Lwo7;->a:Z

    .line 184
    .line 185
    if-eqz v1, :cond_6

    .line 186
    .line 187
    iget-object v1, v7, Lh76;->X:Loh7;

    .line 188
    .line 189
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Lqn7;

    .line 194
    .line 195
    iget-object v1, v1, Lqn7;->f:Lb83;

    .line 196
    .line 197
    if-eqz v1, :cond_6

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    xor-int/2addr v1, v8

    .line 204
    if-ne v1, v8, :cond_6

    .line 205
    .line 206
    move v13, v8

    .line 207
    goto :goto_0

    .line 208
    :cond_6
    move v13, v5

    .line 209
    :goto_0
    iget-object v1, v7, Lh76;->X:Loh7;

    .line 210
    .line 211
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Lqn7;

    .line 216
    .line 217
    iget-object v1, v1, Lqn7;->f:Lb83;

    .line 218
    .line 219
    if-eqz v1, :cond_7

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    xor-int/2addr v1, v8

    .line 226
    if-ne v1, v8, :cond_7

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_7
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v2, Lbp7;

    .line 234
    .line 235
    const/4 v5, 0x4

    .line 236
    invoke-direct {v2, v0, v4, v5}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 240
    .line 241
    .line 242
    :goto_1
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iget-object v2, v7, Lh76;->X:Loh7;

    .line 247
    .line 248
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Lqn7;

    .line 253
    .line 254
    iget-object v2, v2, Lqn7;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v1, v2, v13}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    :cond_8
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    move-object v9, v1

    .line 267
    check-cast v9, Lqn7;

    .line 268
    .line 269
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const/16 v23, 0x0

    .line 273
    .line 274
    const/16 v24, 0x7ff7

    .line 275
    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v11, 0x0

    .line 278
    const/4 v12, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    const/16 v18, 0x0

    .line 286
    .line 287
    const/16 v19, 0x0

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const/16 v21, 0x0

    .line 292
    .line 293
    const/16 v22, 0x0

    .line 294
    .line 295
    invoke-static/range {v9 .. v24}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v6, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_8

    .line 304
    .line 305
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    new-instance v2, Lbp7;

    .line 310
    .line 311
    const/4 v5, 0x5

    .line 312
    invoke-direct {v2, v0, v4, v5}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 313
    .line 314
    .line 315
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :cond_9
    instance-of v2, v1, Lxo7;

    .line 320
    .line 321
    if-eqz v2, :cond_e

    .line 322
    .line 323
    check-cast v1, Lxo7;

    .line 324
    .line 325
    iget-boolean v14, v1, Lxo7;->a:Z

    .line 326
    .line 327
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    iget-object v2, v7, Lh76;->X:Loh7;

    .line 332
    .line 333
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Lqn7;

    .line 338
    .line 339
    iget-object v2, v2, Lqn7;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v2}, Lmn6;->q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    if-nez v7, :cond_a

    .line 352
    .line 353
    new-instance v7, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 354
    .line 355
    invoke-direct {v7, v5, v5}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;-><init>(ZZ)V

    .line 356
    .line 357
    .line 358
    :cond_a
    iget-object v1, v1, Lmn6;->b:Lcom/tencent/mmkv/MMKV;

    .line 359
    .line 360
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    if-nez v9, :cond_b

    .line 365
    .line 366
    goto :goto_2

    .line 367
    :cond_b
    move-object v2, v4

    .line 368
    :goto_2
    if-nez v2, :cond_c

    .line 369
    .line 370
    const-string v2, "Server-List"

    .line 371
    .line 372
    :cond_c
    invoke-static {v7, v5, v14, v8}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->c(Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;ZZI)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-virtual {v1, v2, v5}, Lcom/tencent/mmkv/MMKV;->o(Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    :cond_d
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    move-object v9, v1

    .line 387
    check-cast v9, Lqn7;

    .line 388
    .line 389
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    const/16 v23, 0x0

    .line 393
    .line 394
    const/16 v24, 0x7fef

    .line 395
    .line 396
    const/4 v10, 0x0

    .line 397
    const/4 v11, 0x0

    .line 398
    const/4 v12, 0x0

    .line 399
    const/4 v13, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    const/16 v19, 0x0

    .line 408
    .line 409
    const/16 v20, 0x0

    .line 410
    .line 411
    const/16 v21, 0x0

    .line 412
    .line 413
    const/16 v22, 0x0

    .line 414
    .line 415
    invoke-static/range {v9 .. v24}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v6, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_d

    .line 424
    .line 425
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    new-instance v2, Lbp7;

    .line 430
    .line 431
    const/4 v5, 0x6

    .line 432
    invoke-direct {v2, v0, v4, v5}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 433
    .line 434
    .line 435
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_e
    instance-of v2, v1, Luo7;

    .line 440
    .line 441
    if-eqz v2, :cond_f

    .line 442
    .line 443
    check-cast v1, Luo7;

    .line 444
    .line 445
    iget-object v1, v1, Luo7;->a:Ljava/lang/String;

    .line 446
    .line 447
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    iget-object v5, v7, Lh76;->X:Loh7;

    .line 452
    .line 453
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    check-cast v5, Lqn7;

    .line 458
    .line 459
    iget-object v5, v5, Lqn7;->a:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v2, v1, v5}, Lmn6;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Lnp7;->h()V

    .line 465
    .line 466
    .line 467
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    new-instance v2, Lbp7;

    .line 472
    .line 473
    invoke-direct {v2, v0, v4, v3}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 474
    .line 475
    .line 476
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :cond_f
    instance-of v2, v1, Lso7;

    .line 481
    .line 482
    if-eqz v2, :cond_10

    .line 483
    .line 484
    check-cast v1, Lso7;

    .line 485
    .line 486
    iget-object v1, v1, Lso7;->a:Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    new-instance v5, Lt17;

    .line 493
    .line 494
    const/16 v6, 0xa

    .line 495
    .line 496
    invoke-direct {v5, v0, v1, v4, v6}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 497
    .line 498
    .line 499
    invoke-static {v2, v4, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :cond_10
    instance-of v2, v1, Lro7;

    .line 504
    .line 505
    if-eqz v2, :cond_12

    .line 506
    .line 507
    move-object v0, v1

    .line 508
    check-cast v0, Lro7;

    .line 509
    .line 510
    iget-object v2, v0, Lro7;->a:Ljava/lang/String;

    .line 511
    .line 512
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    :cond_11
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object v7, v0

    .line 520
    check-cast v7, Lqn7;

    .line 521
    .line 522
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    new-instance v1, Lyv5;

    .line 529
    .line 530
    invoke-direct {v1, v2}, Lyv5;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    const/16 v22, 0x3dff

    .line 534
    .line 535
    const/4 v8, 0x0

    .line 536
    const/4 v9, 0x0

    .line 537
    const/4 v10, 0x0

    .line 538
    const/4 v11, 0x0

    .line 539
    const/4 v12, 0x0

    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const/16 v16, 0x0

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/16 v18, 0x0

    .line 548
    .line 549
    const/16 v19, 0x0

    .line 550
    .line 551
    const/16 v20, 0x0

    .line 552
    .line 553
    move-object/from16 v21, v1

    .line 554
    .line 555
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_11

    .line 564
    .line 565
    goto/16 :goto_9

    .line 566
    .line 567
    :cond_12
    instance-of v2, v1, Lto7;

    .line 568
    .line 569
    if-eqz v2, :cond_14

    .line 570
    .line 571
    move-object v0, v1

    .line 572
    check-cast v0, Lto7;

    .line 573
    .line 574
    iget-object v0, v0, Lto7;->a:Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    :goto_3
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    move-object v7, v1

    .line 584
    check-cast v7, Lqn7;

    .line 585
    .line 586
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    const/16 v21, 0x0

    .line 590
    .line 591
    const/16 v22, 0x7dff

    .line 592
    .line 593
    const/4 v8, 0x0

    .line 594
    const/4 v9, 0x0

    .line 595
    const/4 v10, 0x0

    .line 596
    const/4 v11, 0x0

    .line 597
    const/4 v12, 0x0

    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const/16 v17, 0x0

    .line 602
    .line 603
    const/16 v18, 0x0

    .line 604
    .line 605
    const/16 v19, 0x0

    .line 606
    .line 607
    const/16 v20, 0x0

    .line 608
    .line 609
    move-object/from16 v16, v0

    .line 610
    .line 611
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v6, v1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    if-eqz v0, :cond_13

    .line 620
    .line 621
    goto/16 :goto_9

    .line 622
    .line 623
    :cond_13
    move-object/from16 v0, v16

    .line 624
    .line 625
    goto :goto_3

    .line 626
    :cond_14
    instance-of v2, v1, Lvo7;

    .line 627
    .line 628
    if-eqz v2, :cond_16

    .line 629
    .line 630
    check-cast v1, Lvo7;

    .line 631
    .line 632
    iget-object v1, v1, Lvo7;->a:Ljava/lang/String;

    .line 633
    .line 634
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    iget-object v5, v7, Lh76;->X:Loh7;

    .line 639
    .line 640
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v5

    .line 644
    check-cast v5, Lqn7;

    .line 645
    .line 646
    iget-object v5, v5, Lqn7;->a:Ljava/lang/String;

    .line 647
    .line 648
    invoke-virtual {v2, v5, v1}, Lmn6;->h(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    new-instance v5, Ljp7;

    .line 657
    .line 658
    invoke-direct {v5, v1, v0, v4}, Ljp7;-><init>(Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;Lnp7;Lq51;)V

    .line 659
    .line 660
    .line 661
    invoke-static {v2, v4, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    :cond_15
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    move-object v7, v0

    .line 672
    check-cast v7, Lqn7;

    .line 673
    .line 674
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    const/16 v21, 0x0

    .line 678
    .line 679
    const/16 v22, 0x7dff

    .line 680
    .line 681
    const/4 v8, 0x0

    .line 682
    const/4 v9, 0x0

    .line 683
    const/4 v10, 0x0

    .line 684
    const/4 v11, 0x0

    .line 685
    const/4 v12, 0x0

    .line 686
    const/4 v13, 0x0

    .line 687
    const/4 v14, 0x0

    .line 688
    const/4 v15, 0x0

    .line 689
    const/16 v16, 0x0

    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    const/16 v18, 0x0

    .line 694
    .line 695
    const/16 v19, 0x0

    .line 696
    .line 697
    const/16 v20, 0x0

    .line 698
    .line 699
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-eqz v0, :cond_15

    .line 708
    .line 709
    goto/16 :goto_9

    .line 710
    .line 711
    :cond_16
    instance-of v2, v1, Lho7;

    .line 712
    .line 713
    if-eqz v2, :cond_18

    .line 714
    .line 715
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    :cond_17
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    move-object v7, v0

    .line 723
    check-cast v7, Lqn7;

    .line 724
    .line 725
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    const/16 v21, 0x0

    .line 729
    .line 730
    const/16 v22, 0x77ff

    .line 731
    .line 732
    const/4 v8, 0x0

    .line 733
    const/4 v9, 0x0

    .line 734
    const/4 v10, 0x0

    .line 735
    const/4 v11, 0x0

    .line 736
    const/4 v12, 0x0

    .line 737
    const/4 v13, 0x0

    .line 738
    const/4 v14, 0x0

    .line 739
    const/4 v15, 0x0

    .line 740
    const/16 v16, 0x0

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const/16 v18, 0x0

    .line 745
    .line 746
    const/16 v19, 0x0

    .line 747
    .line 748
    const/16 v20, 0x0

    .line 749
    .line 750
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_17

    .line 759
    .line 760
    goto/16 :goto_9

    .line 761
    .line 762
    :cond_18
    instance-of v2, v1, Llo7;

    .line 763
    .line 764
    if-eqz v2, :cond_19

    .line 765
    .line 766
    check-cast v1, Llo7;

    .line 767
    .line 768
    iget-object v1, v1, Llo7;->a:Ljava/lang/String;

    .line 769
    .line 770
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    new-instance v5, Lcp7;

    .line 775
    .line 776
    invoke-direct {v5, v0, v1, v4}, Lcp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 777
    .line 778
    .line 779
    invoke-static {v2, v4, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 780
    .line 781
    .line 782
    return-void

    .line 783
    :cond_19
    instance-of v2, v1, Lno7;

    .line 784
    .line 785
    if-eqz v2, :cond_1a

    .line 786
    .line 787
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    new-instance v2, Lbp7;

    .line 792
    .line 793
    invoke-direct {v2, v0, v4, v8}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 794
    .line 795
    .line 796
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 797
    .line 798
    .line 799
    return-void

    .line 800
    :cond_1a
    instance-of v2, v1, Lio7;

    .line 801
    .line 802
    if-eqz v2, :cond_1c

    .line 803
    .line 804
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    :cond_1b
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    move-object v7, v0

    .line 812
    check-cast v7, Lqn7;

    .line 813
    .line 814
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    const/16 v21, 0x0

    .line 818
    .line 819
    const/16 v22, 0x6fff

    .line 820
    .line 821
    const/4 v8, 0x0

    .line 822
    const/4 v9, 0x0

    .line 823
    const/4 v10, 0x0

    .line 824
    const/4 v11, 0x0

    .line 825
    const/4 v12, 0x0

    .line 826
    const/4 v13, 0x0

    .line 827
    const/4 v14, 0x0

    .line 828
    const/4 v15, 0x0

    .line 829
    const/16 v16, 0x0

    .line 830
    .line 831
    const/16 v17, 0x0

    .line 832
    .line 833
    const/16 v18, 0x0

    .line 834
    .line 835
    const/16 v19, 0x0

    .line 836
    .line 837
    const/16 v20, 0x0

    .line 838
    .line 839
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    if-eqz v0, :cond_1b

    .line 848
    .line 849
    goto/16 :goto_9

    .line 850
    .line 851
    :cond_1c
    instance-of v2, v1, Lzo7;

    .line 852
    .line 853
    if-eqz v2, :cond_1d

    .line 854
    .line 855
    invoke-virtual {v0}, Lnp7;->h()V

    .line 856
    .line 857
    .line 858
    return-void

    .line 859
    :cond_1d
    instance-of v2, v1, Lyo7;

    .line 860
    .line 861
    if-eqz v2, :cond_1f

    .line 862
    .line 863
    move-object v0, v1

    .line 864
    check-cast v0, Lyo7;

    .line 865
    .line 866
    iget-boolean v0, v0, Lyo7;->a:Z

    .line 867
    .line 868
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    :goto_4
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    move-object v7, v1

    .line 876
    check-cast v7, Lqn7;

    .line 877
    .line 878
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    const/16 v21, 0x0

    .line 882
    .line 883
    const/16 v22, 0x5fff

    .line 884
    .line 885
    const/4 v8, 0x0

    .line 886
    const/4 v9, 0x0

    .line 887
    const/4 v10, 0x0

    .line 888
    const/4 v11, 0x0

    .line 889
    const/4 v12, 0x0

    .line 890
    const/4 v13, 0x0

    .line 891
    const/4 v14, 0x0

    .line 892
    const/4 v15, 0x0

    .line 893
    const/16 v16, 0x0

    .line 894
    .line 895
    const/16 v17, 0x0

    .line 896
    .line 897
    const/16 v18, 0x0

    .line 898
    .line 899
    const/16 v19, 0x0

    .line 900
    .line 901
    move/from16 v20, v0

    .line 902
    .line 903
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-virtual {v6, v1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_1e

    .line 912
    .line 913
    goto/16 :goto_9

    .line 914
    .line 915
    :cond_1e
    move/from16 v0, v20

    .line 916
    .line 917
    goto :goto_4

    .line 918
    :cond_1f
    instance-of v2, v1, Lgo7;

    .line 919
    .line 920
    sget-object v23, Lwv5;->a:Lwv5;

    .line 921
    .line 922
    if-eqz v2, :cond_21

    .line 923
    .line 924
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    :cond_20
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    move-object v9, v0

    .line 932
    check-cast v9, Lqn7;

    .line 933
    .line 934
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    const/16 v22, 0x0

    .line 938
    .line 939
    const/16 v24, 0x3fff

    .line 940
    .line 941
    const/4 v10, 0x0

    .line 942
    const/4 v11, 0x0

    .line 943
    const/4 v12, 0x0

    .line 944
    const/4 v13, 0x0

    .line 945
    const/4 v14, 0x0

    .line 946
    const/4 v15, 0x0

    .line 947
    const/16 v16, 0x0

    .line 948
    .line 949
    const/16 v17, 0x0

    .line 950
    .line 951
    const/16 v18, 0x0

    .line 952
    .line 953
    const/16 v19, 0x0

    .line 954
    .line 955
    const/16 v20, 0x0

    .line 956
    .line 957
    const/16 v21, 0x0

    .line 958
    .line 959
    invoke-static/range {v9 .. v24}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v0

    .line 967
    if-eqz v0, :cond_20

    .line 968
    .line 969
    goto/16 :goto_9

    .line 970
    .line 971
    :cond_21
    instance-of v2, v1, Lqo7;

    .line 972
    .line 973
    if-eqz v2, :cond_29

    .line 974
    .line 975
    check-cast v1, Lqo7;

    .line 976
    .line 977
    iget-object v1, v1, Lqo7;->a:Ljava/lang/String;

    .line 978
    .line 979
    iget-object v2, v7, Lh76;->X:Loh7;

    .line 980
    .line 981
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    check-cast v2, Lqn7;

    .line 986
    .line 987
    iget-object v2, v2, Lqn7;->f:Lb83;

    .line 988
    .line 989
    if-nez v2, :cond_23

    .line 990
    .line 991
    :cond_22
    move-object/from16 v19, v4

    .line 992
    .line 993
    goto :goto_8

    .line 994
    :cond_23
    invoke-static {v2}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 995
    .line 996
    .line 997
    move-result-object v9

    .line 998
    invoke-virtual {v9}, Lgu;->iterator()Ljava/util/Iterator;

    .line 999
    .line 1000
    .line 1001
    move-result-object v9

    .line 1002
    :cond_24
    move-object v10, v9

    .line 1003
    check-cast v10, Lrw1;

    .line 1004
    .line 1005
    iget-object v11, v10, Lrw1;->Y:Ljava/util/Iterator;

    .line 1006
    .line 1007
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v11

    .line 1011
    if-eqz v11, :cond_25

    .line 1012
    .line 1013
    invoke-virtual {v10}, Lrw1;->next()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v10

    .line 1017
    move-object v11, v10

    .line 1018
    check-cast v11, Lpb3;

    .line 1019
    .line 1020
    iget-object v11, v11, Lpb3;->b:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v11, Lum6;

    .line 1023
    .line 1024
    iget-object v11, v11, Lum6;->c:Ljava/lang/String;

    .line 1025
    .line 1026
    invoke-static {v11, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v11

    .line 1030
    if-eqz v11, :cond_24

    .line 1031
    .line 1032
    goto :goto_5

    .line 1033
    :cond_25
    move-object v10, v4

    .line 1034
    :goto_5
    check-cast v10, Lpb3;

    .line 1035
    .line 1036
    if-eqz v10, :cond_26

    .line 1037
    .line 1038
    iget v9, v10, Lpb3;->a:I

    .line 1039
    .line 1040
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v9

    .line 1044
    goto :goto_6

    .line 1045
    :cond_26
    move-object v9, v4

    .line 1046
    :goto_6
    if-eqz v9, :cond_22

    .line 1047
    .line 1048
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1049
    .line 1050
    .line 1051
    move-result v9

    .line 1052
    add-int/lit8 v10, v9, 0x1

    .line 1053
    .line 1054
    invoke-static {v10, v2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v10

    .line 1058
    check-cast v10, Lum6;

    .line 1059
    .line 1060
    if-eqz v10, :cond_27

    .line 1061
    .line 1062
    iget-object v2, v10, Lum6;->c:Ljava/lang/String;

    .line 1063
    .line 1064
    :goto_7
    move-object/from16 v19, v2

    .line 1065
    .line 1066
    goto :goto_8

    .line 1067
    :cond_27
    sub-int/2addr v9, v8

    .line 1068
    invoke-static {v9, v2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    check-cast v2, Lum6;

    .line 1073
    .line 1074
    if-eqz v2, :cond_22

    .line 1075
    .line 1076
    iget-object v2, v2, Lum6;->c:Ljava/lang/String;

    .line 1077
    .line 1078
    goto :goto_7

    .line 1079
    :goto_8
    invoke-virtual {v0}, Lnp7;->f()Lmn6;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    iget-object v7, v7, Lh76;->X:Loh7;

    .line 1084
    .line 1085
    invoke-virtual {v7}, Loh7;->getValue()Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v7

    .line 1089
    check-cast v7, Lqn7;

    .line 1090
    .line 1091
    iget-object v7, v7, Lqn7;->a:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-virtual {v2, v1, v7}, Lmn6;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    :cond_28
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    move-object v9, v1

    .line 1104
    check-cast v9, Lqn7;

    .line 1105
    .line 1106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    const/16 v22, 0x0

    .line 1110
    .line 1111
    const/16 v24, 0x39ff

    .line 1112
    .line 1113
    const/4 v10, 0x0

    .line 1114
    const/4 v11, 0x0

    .line 1115
    const/4 v12, 0x0

    .line 1116
    const/4 v13, 0x0

    .line 1117
    const/4 v14, 0x0

    .line 1118
    const/4 v15, 0x0

    .line 1119
    const/16 v16, 0x0

    .line 1120
    .line 1121
    const/16 v17, 0x0

    .line 1122
    .line 1123
    const/16 v18, 0x0

    .line 1124
    .line 1125
    const/16 v20, 0x0

    .line 1126
    .line 1127
    const/16 v21, 0x0

    .line 1128
    .line 1129
    invoke-static/range {v9 .. v24}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    invoke-virtual {v6, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v1

    .line 1137
    if-eqz v1, :cond_28

    .line 1138
    .line 1139
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    new-instance v2, Lip7;

    .line 1144
    .line 1145
    invoke-direct {v2, v0, v4, v5}, Lip7;-><init>(Lnp7;Lq51;B)V

    .line 1146
    .line 1147
    .line 1148
    invoke-static {v1, v4, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1149
    .line 1150
    .line 1151
    return-void

    .line 1152
    :cond_29
    instance-of v0, v1, Lfo7;

    .line 1153
    .line 1154
    if-eqz v0, :cond_2c

    .line 1155
    .line 1156
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    :cond_2a
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    move-object v7, v0

    .line 1164
    check-cast v7, Lqn7;

    .line 1165
    .line 1166
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1167
    .line 1168
    .line 1169
    const/16 v21, 0x0

    .line 1170
    .line 1171
    const/16 v22, 0x7bff

    .line 1172
    .line 1173
    const/4 v8, 0x0

    .line 1174
    const/4 v9, 0x0

    .line 1175
    const/4 v10, 0x0

    .line 1176
    const/4 v11, 0x0

    .line 1177
    const/4 v12, 0x0

    .line 1178
    const/4 v13, 0x0

    .line 1179
    const/4 v14, 0x0

    .line 1180
    const/4 v15, 0x0

    .line 1181
    const/16 v16, 0x0

    .line 1182
    .line 1183
    const/16 v17, 0x0

    .line 1184
    .line 1185
    const/16 v18, 0x0

    .line 1186
    .line 1187
    const/16 v19, 0x0

    .line 1188
    .line 1189
    const/16 v20, 0x0

    .line 1190
    .line 1191
    invoke-static/range {v7 .. v22}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v1

    .line 1195
    invoke-virtual {v6, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-eqz v0, :cond_2a

    .line 1200
    .line 1201
    :cond_2b
    :goto_9
    return-void

    .line 1202
    :cond_2c
    invoke-static {}, Lb61;->c()V

    .line 1203
    .line 1204
    .line 1205
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lip7;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lip7;-><init>(Lnp7;Lq51;B)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i(Lco7;Luy7;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnp7;->g:Lu77;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    return-object p0
.end method

.method public final j(Lb71;Ls51;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lkp7;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lkp7;

    .line 13
    .line 14
    iget v4, v3, Lkp7;->l0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lkp7;->l0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lkp7;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lkp7;-><init>(Lnp7;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lkp7;->j0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lkp7;->l0:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    sget-object v10, Lc71;->X:Lc71;

    .line 41
    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v8, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget v1, v3, Lkp7;->i0:I

    .line 51
    .line 52
    iget-object v3, v3, Lkp7;->h0:Lj2;

    .line 53
    .line 54
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v16, v3

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v9

    .line 67
    :cond_2
    iget-object v1, v3, Lkp7;->h0:Lj2;

    .line 68
    .line 69
    iget-object v4, v3, Lkp7;->g0:Lxg1;

    .line 70
    .line 71
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v1, v3, Lkp7;->g0:Lxg1;

    .line 76
    .line 77
    iget-object v4, v3, Lkp7;->f0:Lyg1;

    .line 78
    .line 79
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v2, Ltp1;->a:Lnf1;

    .line 87
    .line 88
    sget-object v2, Lye1;->Z:Lye1;

    .line 89
    .line 90
    new-instance v4, Llp7;

    .line 91
    .line 92
    invoke-direct {v4, v0, v9, v8}, Llp7;-><init>(Lnp7;Lq51;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v2, v4, v6}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v11, Llp7;

    .line 100
    .line 101
    invoke-direct {v11, v0, v9, v7}, Llp7;-><init>(Lnp7;Lq51;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2, v11, v6}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    new-instance v12, Llp7;

    .line 109
    .line 110
    invoke-direct {v12, v0, v9, v6}, Llp7;-><init>(Lnp7;Lq51;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2, v12, v6}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v11, v3, Lkp7;->f0:Lyg1;

    .line 118
    .line 119
    iput-object v1, v3, Lkp7;->g0:Lxg1;

    .line 120
    .line 121
    iput v8, v3, Lkp7;->l0:I

    .line 122
    .line 123
    invoke-virtual {v4, v3}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-ne v2, v10, :cond_5

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v4, v11

    .line 131
    :goto_1
    check-cast v2, Lj2;

    .line 132
    .line 133
    iput-object v9, v3, Lkp7;->f0:Lyg1;

    .line 134
    .line 135
    iput-object v1, v3, Lkp7;->g0:Lxg1;

    .line 136
    .line 137
    iput-object v2, v3, Lkp7;->h0:Lj2;

    .line 138
    .line 139
    iput v6, v3, Lkp7;->l0:I

    .line 140
    .line 141
    invoke-interface {v4, v3}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-ne v4, v10, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    move-object/from16 v26, v4

    .line 149
    .line 150
    move-object v4, v1

    .line 151
    move-object v1, v2

    .line 152
    move-object/from16 v2, v26

    .line 153
    .line 154
    :goto_2
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 155
    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->d()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-ne v2, v8, :cond_7

    .line 163
    .line 164
    move v2, v8

    .line 165
    goto :goto_3

    .line 166
    :cond_7
    move v2, v7

    .line 167
    :goto_3
    iput-object v9, v3, Lkp7;->f0:Lyg1;

    .line 168
    .line 169
    iput-object v9, v3, Lkp7;->g0:Lxg1;

    .line 170
    .line 171
    iput-object v1, v3, Lkp7;->h0:Lj2;

    .line 172
    .line 173
    iput v2, v3, Lkp7;->i0:I

    .line 174
    .line 175
    iput v5, v3, Lkp7;->l0:I

    .line 176
    .line 177
    invoke-interface {v4, v3}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-ne v3, v10, :cond_8

    .line 182
    .line 183
    :goto_4
    return-object v10

    .line 184
    :cond_8
    move-object/from16 v16, v1

    .line 185
    .line 186
    move v1, v2

    .line 187
    move-object v2, v3

    .line 188
    :goto_5
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 189
    .line 190
    if-eqz v2, :cond_9

    .line 191
    .line 192
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->c()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    :cond_9
    move-object/from16 v17, v9

    .line 197
    .line 198
    if-eqz v1, :cond_a

    .line 199
    .line 200
    move v14, v8

    .line 201
    goto :goto_6

    .line 202
    :cond_a
    move v14, v7

    .line 203
    :goto_6
    iget-object v0, v0, Lnp7;->e:Loh7;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    :cond_b
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    move-object v10, v1

    .line 213
    check-cast v10, Lqn7;

    .line 214
    .line 215
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    const/16 v24, 0x0

    .line 219
    .line 220
    const/16 v25, 0x7f97

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    const/16 v20, 0x0

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const/16 v23, 0x0

    .line 237
    .line 238
    invoke-static/range {v10 .. v25}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_b

    .line 247
    .line 248
    sget-object v0, Ldn8;->a:Ldn8;

    .line 249
    .line 250
    return-object v0
.end method

.method public final k(Ls51;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lmp7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lmp7;

    .line 7
    .line 8
    iget v1, v0, Lmp7;->h0:I

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
    iput v1, v0, Lmp7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmp7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lmp7;-><init>(Lnp7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lmp7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lmp7;->h0:I

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
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lnp7;->c:Lvz7;

    .line 48
    .line 49
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lig8;

    .line 54
    .line 55
    iget-object p1, p1, Lig8;->e:Lf76;

    .line 56
    .line 57
    new-instance v1, Lbp7;

    .line 58
    .line 59
    const/4 v3, 0x7

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {v1, p0, v4, v3}, Lbp7;-><init>(Lnp7;Lq51;B)V

    .line 62
    .line 63
    .line 64
    iput v2, v0, Lmp7;->h0:I

    .line 65
    .line 66
    invoke-static {p1, v1, v0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p0, p1, :cond_3

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_1
    const-string p0, "SharedFlow never completes, this call should never return."

    .line 76
    .line 77
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
