.class public final Lqi;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public i0:Ljava/lang/Object;

.field public j0:Ljava/lang/Object;

.field public k0:Ljava/lang/Object;

.field public l0:Ljava/lang/Object;

.field public final synthetic m0:Ljava/lang/Object;

.field public final synthetic n0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh57;Lor8;Ljava/util/List;Ljava/util/Map;Lqi0;Lq51;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, Lqi;->g0:B

    .line 21
    iput-object p1, p0, Lqi;->i0:Ljava/lang/Object;

    iput-object p2, p0, Lqi;->k0:Ljava/lang/Object;

    iput-object p3, p0, Lqi;->l0:Ljava/lang/Object;

    iput-object p4, p0, Lqi;->m0:Ljava/lang/Object;

    iput-object p5, p0, Lqi;->n0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 23
    iput-byte p6, p0, Lqi;->g0:B

    iput-object p1, p0, Lqi;->k0:Ljava/lang/Object;

    iput-object p2, p0, Lqi;->l0:Ljava/lang/Object;

    iput-object p3, p0, Lqi;->m0:Ljava/lang/Object;

    iput-object p4, p0, Lqi;->n0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Llr5;Ld27;Lq51;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lqi;->g0:B

    .line 22
    iput-object p1, p0, Lqi;->m0:Ljava/lang/Object;

    iput-object p2, p0, Lqi;->n0:Ljava/lang/Object;

    invoke-direct {p0, v0, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lr77;Ldn2;Ltn2;Lky2;Landroid/content/Context;Lrn2;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, Lqi;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lqi;->i0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lqi;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lqi;->k0:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lqi;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lqi;->m0:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lqi;->n0:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p7}, Luy7;-><init>(ILq51;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lqi;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lqi;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lqi;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lqi;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lqi;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lqi;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lqi;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lc71;->X:Lc71;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lqi;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lqi;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lqi;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lqi;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Lqi;

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lqi;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_3
    invoke-virtual {p0, p2, p1}, Lqi;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lqi;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lqi;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 12

    .line 1
    iget-byte v0, p0, Lqi;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lqi;->n0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lqi;->m0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lqi;

    .line 11
    .line 12
    iget-object v0, p0, Lqi;->i0:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, Lh57;

    .line 16
    .line 17
    iget-object v0, p0, Lqi;->k0:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lor8;

    .line 21
    .line 22
    iget-object p0, p0, Lqi;->l0:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, p0

    .line 25
    check-cast v6, Ljava/util/List;

    .line 26
    .line 27
    move-object v7, v2

    .line 28
    check-cast v7, Ljava/util/Map;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Lqi0;

    .line 32
    .line 33
    move-object v9, p1

    .line 34
    invoke-direct/range {v3 .. v9}, Lqi;-><init>(Lh57;Lor8;Ljava/util/List;Ljava/util/Map;Lqi0;Lq51;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v3, Lqi;->j0:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v3

    .line 40
    :pswitch_0
    move-object v9, p1

    .line 41
    new-instance v4, Lqi;

    .line 42
    .line 43
    iget-object p1, p0, Lqi;->i0:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    check-cast v5, Lr77;

    .line 47
    .line 48
    iget-object p1, p0, Lqi;->j0:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v6, p1

    .line 51
    check-cast v6, Ldn2;

    .line 52
    .line 53
    iget-object p1, p0, Lqi;->k0:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v7, p1

    .line 56
    check-cast v7, Ltn2;

    .line 57
    .line 58
    iget-object p0, p0, Lqi;->l0:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v8, p0

    .line 61
    check-cast v8, Lky2;

    .line 62
    .line 63
    check-cast v2, Landroid/content/Context;

    .line 64
    .line 65
    move-object v10, v1

    .line 66
    check-cast v10, Lrn2;

    .line 67
    .line 68
    move-object v11, v9

    .line 69
    move-object v9, v2

    .line 70
    invoke-direct/range {v4 .. v11}, Lqi;-><init>(Lr77;Ldn2;Ltn2;Lky2;Landroid/content/Context;Lrn2;Lq51;)V

    .line 71
    .line 72
    .line 73
    return-object v4

    .line 74
    :pswitch_1
    move-object v9, p1

    .line 75
    new-instance p0, Lqi;

    .line 76
    .line 77
    check-cast v2, Llr5;

    .line 78
    .line 79
    check-cast v1, Ld27;

    .line 80
    .line 81
    invoke-direct {p0, v2, v1, v9}, Lqi;-><init>(Llr5;Ld27;Lq51;)V

    .line 82
    .line 83
    .line 84
    iput-object p2, p0, Lqi;->j0:Ljava/lang/Object;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    move-object v9, p1

    .line 88
    new-instance v4, Lqi;

    .line 89
    .line 90
    iget-object p1, p0, Lqi;->k0:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v5, p1

    .line 93
    check-cast v5, Lg94;

    .line 94
    .line 95
    iget-object p0, p0, Lqi;->l0:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v6, p0

    .line 98
    check-cast v6, Lo84;

    .line 99
    .line 100
    move-object v7, v2

    .line 101
    check-cast v7, Lb71;

    .line 102
    .line 103
    move-object v8, v1

    .line 104
    check-cast v8, Lrn2;

    .line 105
    .line 106
    const/4 v10, 0x1

    .line 107
    invoke-direct/range {v4 .. v10}, Lqi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :pswitch_3
    move-object v9, p1

    .line 112
    new-instance v4, Lqi;

    .line 113
    .line 114
    iget-object p1, p0, Lqi;->k0:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v5, p1

    .line 117
    check-cast v5, Ljp0;

    .line 118
    .line 119
    iget-object p0, p0, Lqi;->l0:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v6, p0

    .line 122
    check-cast v6, Loi;

    .line 123
    .line 124
    move-object v7, v2

    .line 125
    check-cast v7, Ly05;

    .line 126
    .line 127
    move-object v8, v1

    .line 128
    check-cast v8, Ly05;

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    invoke-direct/range {v4 .. v10}, Lqi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 132
    .line 133
    .line 134
    iput-object p2, v4, Lqi;->j0:Ljava/lang/Object;

    .line 135
    .line 136
    return-object v4

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lqi;->g0:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lc71;->X:Lc71;

    .line 13
    .line 14
    iget-boolean v2, v1, Lqi;->h0:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Lqi;->j0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lb71;

    .line 23
    .line 24
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lug1; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lua8; {:try_start_0 .. :try_end_0} :catch_1

    .line 25
    .line 26
    .line 27
    move-object/from16 v3, p1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v1, Lqi;->j0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Lb71;

    .line 46
    .line 47
    iget-object v3, v1, Lqi;->i0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lh57;

    .line 50
    .line 51
    iget-object v3, v3, Lh57;->e:Lvz7;

    .line 52
    .line 53
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Le57;

    .line 58
    .line 59
    invoke-virtual {v3}, Le57;->c()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_c

    .line 64
    .line 65
    :try_start_1
    iget-object v3, v1, Lqi;->k0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lor8;

    .line 68
    .line 69
    iget-object v6, v1, Lqi;->l0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ljava/util/List;

    .line 72
    .line 73
    iput-object v2, v1, Lqi;->j0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-boolean v4, v1, Lqi;->h0:Z

    .line 76
    .line 77
    const-wide/16 v7, 0x1388

    .line 78
    .line 79
    invoke-virtual {v3, v6, v7, v8, v1}, Lor8;->b(Ljava/util/List;JLs51;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-ne v3, v0, :cond_2

    .line 84
    .line 85
    move-object v5, v0

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_2
    move-object v0, v2

    .line 89
    :goto_0
    check-cast v3, Ljava/util/List;
    :try_end_1
    .catch Lug1; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lua8; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    .line 91
    invoke-static {v0}, Lgv3;->E(Lb71;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_a

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_9

    .line 110
    .line 111
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_9

    .line 116
    .line 117
    iget-object v0, v1, Lqi;->k0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lor8;

    .line 120
    .line 121
    iget-object v2, v0, Lor8;->e:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v4, v1, Lqi;->l0:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/List;

    .line 126
    .line 127
    monitor-enter v2

    .line 128
    const/16 v5, 0xa

    .line 129
    .line 130
    :try_start_2
    invoke-static {v4, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-static {v5}, Laq4;->G(I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    const/16 v6, 0x10

    .line 139
    .line 140
    if-ge v5, v6, :cond_4

    .line 141
    .line 142
    move v5, v6

    .line 143
    :cond_4
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    move-object v8, v7

    .line 163
    check-cast v8, Lwg1;

    .line 164
    .line 165
    invoke-interface {v4, v8}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    if-eqz v8, :cond_5

    .line 174
    .line 175
    check-cast v8, Landroid/view/Surface;

    .line 176
    .line 177
    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    goto :goto_3

    .line 183
    :cond_5
    const-string v0, "Required value was null."

    .line 184
    .line 185
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v1

    .line 191
    :cond_6
    iput-object v6, v0, Lor8;->h:Ljava/util/LinkedHashMap;

    .line 192
    .line 193
    invoke-virtual {v0}, Lor8;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    .line 195
    .line 196
    monitor-exit v2

    .line 197
    iget-object v0, v1, Lqi;->m0:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ljava/util/Map;

    .line 200
    .line 201
    iget-object v2, v1, Lqi;->l0:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, Ljava/util/List;

    .line 204
    .line 205
    iget-object v4, v1, Lqi;->n0:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v4, Lqi0;

    .line 208
    .line 209
    iget-object v1, v1, Lqi;->k0:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Lor8;

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_8

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Ljava/util/Map$Entry;

    .line 232
    .line 233
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    check-cast v6, Ldl7;

    .line 238
    .line 239
    iget v6, v6, Ldl7;->a:I

    .line 240
    .line 241
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-interface {v2, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    check-cast v7, Landroid/view/Surface;

    .line 254
    .line 255
    const-string v8, "CXCP"

    .line 256
    .line 257
    invoke-static {v8}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_7

    .line 262
    .line 263
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    invoke-static {v6}, Ldl7;->a(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    :cond_7
    invoke-virtual {v4, v6, v7}, Lqi0;->m(ILandroid/view/Surface;)V

    .line 270
    .line 271
    .line 272
    iget-object v7, v1, Lor8;->c:Lc93;

    .line 273
    .line 274
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Lwg1;

    .line 279
    .line 280
    invoke-interface {v7, v6, v5, v4}, Lc93;->t(ILwg1;Lqi0;)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_8
    invoke-static {}, Lhi5;->k0()Z

    .line 285
    .line 286
    .line 287
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :goto_3
    monitor-exit v2

    .line 291
    throw v0

    .line 292
    :cond_9
    invoke-static {}, Lhi5;->m0()Z

    .line 293
    .line 294
    .line 295
    iget-object v0, v1, Lqi;->i0:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Lh57;

    .line 298
    .line 299
    iget-object v1, v1, Lqi;->l0:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v1, Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {v3, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lwg1;

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Lh57;->a(Lwg1;)V

    .line 314
    .line 315
    .line 316
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_a
    :goto_4
    invoke-static {}, Lhi5;->k0()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_b

    .line 324
    .line 325
    invoke-static {v0}, Lgv3;->E(Lb71;)Z

    .line 326
    .line 327
    .line 328
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    :cond_b
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :catch_1
    invoke-static {}, Lhi5;->m0()Z

    .line 335
    .line 336
    .line 337
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :goto_5
    invoke-static {}, Lhi5;->m0()Z

    .line 341
    .line 342
    .line 343
    iget-object v1, v1, Lqi;->i0:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v1, Lh57;

    .line 346
    .line 347
    iget-object v0, v0, Lug1;->X:Lwg1;

    .line 348
    .line 349
    invoke-virtual {v1, v0}, Lh57;->a(Lwg1;)V

    .line 350
    .line 351
    .line 352
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_c
    const-string v0, "Check failed."

    .line 356
    .line 357
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :goto_6
    return-object v5

    .line 361
    :pswitch_0
    sget-object v0, Lc71;->X:Lc71;

    .line 362
    .line 363
    iget-boolean v2, v1, Lqi;->h0:Z

    .line 364
    .line 365
    if-eqz v2, :cond_e

    .line 366
    .line 367
    if-eq v2, v4, :cond_d

    .line 368
    .line 369
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 370
    .line 371
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_d
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    iget-object v2, v1, Lqi;->i0:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, Lr77;

    .line 385
    .line 386
    new-instance v6, Lyq7;

    .line 387
    .line 388
    iget-object v3, v1, Lqi;->j0:Ljava/lang/Object;

    .line 389
    .line 390
    move-object v7, v3

    .line 391
    check-cast v7, Ldn2;

    .line 392
    .line 393
    iget-object v3, v1, Lqi;->k0:Ljava/lang/Object;

    .line 394
    .line 395
    move-object v8, v3

    .line 396
    check-cast v8, Ltn2;

    .line 397
    .line 398
    iget-object v3, v1, Lqi;->l0:Ljava/lang/Object;

    .line 399
    .line 400
    move-object v9, v3

    .line 401
    check-cast v9, Lky2;

    .line 402
    .line 403
    iget-object v3, v1, Lqi;->m0:Ljava/lang/Object;

    .line 404
    .line 405
    move-object v10, v3

    .line 406
    check-cast v10, Landroid/content/Context;

    .line 407
    .line 408
    iget-object v3, v1, Lqi;->n0:Ljava/lang/Object;

    .line 409
    .line 410
    move-object v11, v3

    .line 411
    check-cast v11, Lrn2;

    .line 412
    .line 413
    invoke-direct/range {v6 .. v11}, Lyq7;-><init>(Ldn2;Ltn2;Lky2;Landroid/content/Context;Lrn2;)V

    .line 414
    .line 415
    .line 416
    iput-boolean v4, v1, Lqi;->h0:Z

    .line 417
    .line 418
    invoke-interface {v2, v6, v1}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    if-ne v1, v0, :cond_f

    .line 423
    .line 424
    move-object v5, v0

    .line 425
    goto :goto_8

    .line 426
    :cond_f
    :goto_7
    invoke-static {}, Lb61;->n()V

    .line 427
    .line 428
    .line 429
    :goto_8
    return-object v5

    .line 430
    :pswitch_1
    sget-object v2, Lw17;->Z:Lw17;

    .line 431
    .line 432
    sget-object v6, Ldn8;->a:Ldn8;

    .line 433
    .line 434
    iget-object v0, v1, Lqi;->m0:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v7, v0

    .line 437
    check-cast v7, Llr5;

    .line 438
    .line 439
    iget-object v0, v1, Lqi;->n0:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, Ld27;

    .line 442
    .line 443
    iget-object v8, v0, Ld27;->b:Loh7;

    .line 444
    .line 445
    iget-object v9, v1, Lqi;->j0:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v9, Lb71;

    .line 448
    .line 449
    sget-object v10, Lc71;->X:Lc71;

    .line 450
    .line 451
    iget-boolean v11, v1, Lqi;->h0:Z

    .line 452
    .line 453
    if-eqz v11, :cond_11

    .line 454
    .line 455
    if-ne v11, v4, :cond_10

    .line 456
    .line 457
    iget-object v0, v1, Lqi;->l0:Ljava/lang/Object;

    .line 458
    .line 459
    move-object v3, v0

    .line 460
    check-cast v3, Ljava/net/ServerSocket;

    .line 461
    .line 462
    iget-object v0, v1, Lqi;->k0:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Llr5;

    .line 465
    .line 466
    iget-object v1, v1, Lqi;->i0:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v1, Ld27;

    .line 469
    .line 470
    :try_start_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 471
    .line 472
    .line 473
    move-object v11, v3

    .line 474
    move-object v3, v1

    .line 475
    move-object/from16 v1, p1

    .line 476
    .line 477
    goto/16 :goto_c

    .line 478
    .line 479
    :catchall_1
    move-exception v0

    .line 480
    move-object v1, v0

    .line 481
    goto/16 :goto_f

    .line 482
    .line 483
    :cond_10
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 484
    .line 485
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_12

    .line 489
    .line 490
    :cond_11
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :try_start_4
    new-instance v11, Ljava/net/ServerSocket;

    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    invoke-direct {v11, v12}, Ljava/net/ServerSocket;-><init>(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 497
    .line 498
    .line 499
    const v12, 0xdbba0

    .line 500
    .line 501
    .line 502
    :try_start_5
    invoke-virtual {v11, v12}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 503
    .line 504
    .line 505
    invoke-static {}, Lrl8;->a()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v12

    .line 509
    sget-object v13, Lss8;->a:Lss8;

    .line 510
    .line 511
    invoke-static {}, Lss8;->l()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    if-eqz v13, :cond_12

    .line 516
    .line 517
    invoke-virtual {v11}, Ljava/net/ServerSocket;->getLocalPort()I

    .line 518
    .line 519
    .line 520
    move-result v14

    .line 521
    new-instance v15, Ljava/lang/Integer;

    .line 522
    .line 523
    invoke-direct {v15, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 524
    .line 525
    .line 526
    goto :goto_a

    .line 527
    :goto_9
    move-object v1, v0

    .line 528
    move-object v3, v11

    .line 529
    goto/16 :goto_f

    .line 530
    .line 531
    :catchall_2
    move-exception v0

    .line 532
    goto :goto_9

    .line 533
    :cond_12
    move-object v15, v5

    .line 534
    :goto_a
    new-instance v14, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 535
    .line 536
    invoke-direct {v14, v12, v13, v15}, Lsu/happ/proxyutility/dto/SocketServerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 537
    .line 538
    .line 539
    :cond_13
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v13

    .line 543
    move-object v15, v13

    .line 544
    check-cast v15, Lw17;

    .line 545
    .line 546
    sget-object v15, Lw17;->Y:Lw17;

    .line 547
    .line 548
    invoke-virtual {v8, v13, v15}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v13

    .line 552
    if-eqz v13, :cond_13

    .line 553
    .line 554
    sget-object v13, Lwu7;->y1:Lcom/google/gson/a;

    .line 555
    .line 556
    invoke-virtual {v13, v14}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    invoke-static {v13}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v13

    .line 564
    iget-object v14, v7, Llr5;->Y:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v14, Lwu7;

    .line 567
    .line 568
    iget-object v14, v14, Lwu7;->u1:Loh7;

    .line 569
    .line 570
    :goto_b
    invoke-virtual {v14}, Loh7;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v15

    .line 574
    move-object/from16 v16, v15

    .line 575
    .line 576
    check-cast v16, Ltu7;

    .line 577
    .line 578
    new-instance v4, Lru7;

    .line 579
    .line 580
    invoke-direct {v4, v13}, Lru7;-><init>(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v14, v15, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eqz v4, :cond_19

    .line 588
    .line 589
    sget-object v4, Ltp1;->a:Lnf1;

    .line 590
    .line 591
    sget-object v4, Lye1;->Z:Lye1;

    .line 592
    .line 593
    new-instance v13, Ll40;

    .line 594
    .line 595
    const/16 v14, 0xc

    .line 596
    .line 597
    invoke-direct {v13, v11, v5, v14}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 598
    .line 599
    .line 600
    invoke-static {v9, v4, v13, v3}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    new-instance v14, Lt17;

    .line 605
    .line 606
    invoke-direct {v14, v0, v12, v5, v3}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 607
    .line 608
    .line 609
    invoke-static {v9, v4, v14, v3}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    sget-object v4, Lgx1;->Y:Lbe;

    .line 614
    .line 615
    sget-object v4, Llx1;->g0:Llx1;

    .line 616
    .line 617
    const/16 v12, 0xf

    .line 618
    .line 619
    invoke-static {v12, v4}, Lvj8;->l0(ILlx1;)J

    .line 620
    .line 621
    .line 622
    move-result-wide v14

    .line 623
    new-instance v4, Lt17;

    .line 624
    .line 625
    const/4 v12, 0x1

    .line 626
    invoke-direct {v4, v13, v3, v5, v12}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 627
    .line 628
    .line 629
    iput-object v9, v1, Lqi;->j0:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v0, v1, Lqi;->i0:Ljava/lang/Object;

    .line 632
    .line 633
    iput-object v7, v1, Lqi;->k0:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v11, v1, Lqi;->l0:Ljava/lang/Object;

    .line 636
    .line 637
    iput-boolean v12, v1, Lqi;->h0:Z

    .line 638
    .line 639
    invoke-static {v14, v15}, Lu70;->s0(J)J

    .line 640
    .line 641
    .line 642
    move-result-wide v12

    .line 643
    invoke-static {v12, v13, v4, v1}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    if-ne v1, v10, :cond_14

    .line 648
    .line 649
    move-object v5, v10

    .line 650
    goto/16 :goto_12

    .line 651
    .line 652
    :cond_14
    move-object v3, v0

    .line 653
    move-object v0, v7

    .line 654
    :goto_c
    check-cast v1, Ljava/util/List;

    .line 655
    .line 656
    if-eqz v1, :cond_15

    .line 657
    .line 658
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    if-eqz v4, :cond_16

    .line 667
    .line 668
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    check-cast v4, Ljava/lang/String;

    .line 673
    .line 674
    invoke-interface {v0, v4}, Lv17;->q(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    goto :goto_d

    .line 678
    :cond_15
    invoke-interface {v0}, Lv17;->k()V

    .line 679
    .line 680
    .line 681
    :cond_16
    invoke-interface {v9}, Lb71;->getCoroutineContext()Ls61;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    sget-object v1, Loy1;->E0:Loy1;

    .line 686
    .line 687
    invoke-interface {v0, v1}, Ls61;->H0(Lr61;)Lq61;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    check-cast v0, Lbm3;

    .line 692
    .line 693
    if-eqz v0, :cond_17

    .line 694
    .line 695
    invoke-interface {v0}, Lbm3;->g()Lu27;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-interface {v0}, Lu27;->iterator()Ljava/util/Iterator;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_17

    .line 708
    .line 709
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    check-cast v1, Lbm3;

    .line 714
    .line 715
    invoke-interface {v1, v5}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 716
    .line 717
    .line 718
    goto :goto_e

    .line 719
    :cond_17
    iget-object v0, v3, Ld27;->b:Loh7;

    .line 720
    .line 721
    :cond_18
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    move-object v3, v1

    .line 726
    check-cast v3, Lw17;

    .line 727
    .line 728
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 732
    if-eqz v1, :cond_18

    .line 733
    .line 734
    :try_start_6
    invoke-static {v11, v5}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 735
    .line 736
    .line 737
    move-object v1, v6

    .line 738
    goto :goto_11

    .line 739
    :catchall_3
    move-exception v0

    .line 740
    goto :goto_10

    .line 741
    :cond_19
    const/4 v4, 0x1

    .line 742
    goto/16 :goto_b

    .line 743
    .line 744
    :goto_f
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 745
    :catchall_4
    move-exception v0

    .line 746
    :try_start_8
    invoke-static {v3, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 747
    .line 748
    .line 749
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 750
    :goto_10
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 751
    .line 752
    if-nez v1, :cond_1c

    .line 753
    .line 754
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 755
    .line 756
    if-nez v1, :cond_1c

    .line 757
    .line 758
    new-instance v1, Lrj6;

    .line 759
    .line 760
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 761
    .line 762
    .line 763
    :goto_11
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    if-eqz v0, :cond_1b

    .line 768
    .line 769
    :cond_1a
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    move-object v1, v0

    .line 774
    check-cast v1, Lw17;

    .line 775
    .line 776
    invoke-virtual {v8, v0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    if-eqz v0, :cond_1a

    .line 781
    .line 782
    :cond_1b
    iget-object v0, v7, Llr5;->Y:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Lwu7;

    .line 785
    .line 786
    invoke-virtual {v0}, Lwu7;->Y()V

    .line 787
    .line 788
    .line 789
    move-object v5, v6

    .line 790
    :goto_12
    return-object v5

    .line 791
    :cond_1c
    throw v0

    .line 792
    :pswitch_2
    sget-object v0, Ldn8;->a:Ldn8;

    .line 793
    .line 794
    iget-object v4, v1, Lqi;->k0:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v4, Lg94;

    .line 797
    .line 798
    sget-object v6, Lc71;->X:Lc71;

    .line 799
    .line 800
    iget-boolean v7, v1, Lqi;->h0:Z

    .line 801
    .line 802
    if-eqz v7, :cond_1e

    .line 803
    .line 804
    const/4 v12, 0x1

    .line 805
    if-ne v7, v12, :cond_1d

    .line 806
    .line 807
    iget-object v2, v1, Lqi;->j0:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v2, Lea6;

    .line 810
    .line 811
    iget-object v1, v1, Lqi;->i0:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v1, Lea6;

    .line 814
    .line 815
    :try_start_9
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 816
    .line 817
    .line 818
    goto/16 :goto_17

    .line 819
    .line 820
    :catchall_5
    move-exception v0

    .line 821
    goto/16 :goto_1b

    .line 822
    .line 823
    :cond_1d
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 824
    .line 825
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_19

    .line 829
    .line 830
    :cond_1e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    iget-object v7, v4, Lg94;->i:Lo84;

    .line 834
    .line 835
    sget-object v8, Lo84;->X:Lo84;

    .line 836
    .line 837
    if-ne v7, v8, :cond_1f

    .line 838
    .line 839
    goto/16 :goto_18

    .line 840
    .line 841
    :cond_1f
    new-instance v7, Lea6;

    .line 842
    .line 843
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 844
    .line 845
    .line 846
    new-instance v8, Lea6;

    .line 847
    .line 848
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 849
    .line 850
    .line 851
    :try_start_a
    iget-object v9, v1, Lqi;->l0:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v9, Lo84;

    .line 854
    .line 855
    iget-object v10, v1, Lqi;->m0:Ljava/lang/Object;

    .line 856
    .line 857
    move-object/from16 v20, v10

    .line 858
    .line 859
    check-cast v20, Lb71;

    .line 860
    .line 861
    iget-object v10, v1, Lqi;->n0:Ljava/lang/Object;

    .line 862
    .line 863
    move-object/from16 v24, v10

    .line 864
    .line 865
    check-cast v24, Lrn2;

    .line 866
    .line 867
    iput-object v7, v1, Lqi;->i0:Ljava/lang/Object;

    .line 868
    .line 869
    iput-object v8, v1, Lqi;->j0:Ljava/lang/Object;

    .line 870
    .line 871
    const/4 v12, 0x1

    .line 872
    iput-boolean v12, v1, Lqi;->h0:Z

    .line 873
    .line 874
    new-instance v10, Lmm0;

    .line 875
    .line 876
    invoke-static {v1}, Lmb6;->H(Lq51;)Lq51;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    invoke-direct {v10, v12, v1}, Lmm0;-><init>(ILq51;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v10}, Lmm0;->s()V

    .line 884
    .line 885
    .line 886
    sget-object v1, Ln84;->Companion:Ll84;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    const/4 v11, 0x4

    .line 899
    if-eq v1, v3, :cond_22

    .line 900
    .line 901
    if-eq v1, v2, :cond_21

    .line 902
    .line 903
    if-eq v1, v11, :cond_20

    .line 904
    .line 905
    move-object/from16 v18, v5

    .line 906
    .line 907
    goto :goto_14

    .line 908
    :cond_20
    sget-object v1, Ln84;->ON_RESUME:Ln84;

    .line 909
    .line 910
    :goto_13
    move-object/from16 v18, v1

    .line 911
    .line 912
    goto :goto_14

    .line 913
    :cond_21
    sget-object v1, Ln84;->ON_START:Ln84;

    .line 914
    .line 915
    goto :goto_13

    .line 916
    :cond_22
    sget-object v1, Ln84;->ON_CREATE:Ln84;

    .line 917
    .line 918
    goto :goto_13

    .line 919
    :goto_14
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    if-eq v1, v3, :cond_25

    .line 924
    .line 925
    if-eq v1, v2, :cond_24

    .line 926
    .line 927
    if-eq v1, v11, :cond_23

    .line 928
    .line 929
    move-object/from16 v21, v5

    .line 930
    .line 931
    goto :goto_16

    .line 932
    :cond_23
    sget-object v1, Ln84;->ON_PAUSE:Ln84;

    .line 933
    .line 934
    :goto_15
    move-object/from16 v21, v1

    .line 935
    .line 936
    goto :goto_16

    .line 937
    :cond_24
    sget-object v1, Ln84;->ON_STOP:Ln84;

    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_25
    sget-object v1, Ln84;->ON_DESTROY:Ln84;

    .line 941
    .line 942
    goto :goto_15

    .line 943
    :goto_16
    invoke-static {}, Lr15;->a()Lq15;

    .line 944
    .line 945
    .line 946
    move-result-object v23

    .line 947
    new-instance v17, Lce6;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 948
    .line 949
    move-object/from16 v19, v7

    .line 950
    .line 951
    move-object/from16 v22, v10

    .line 952
    .line 953
    :try_start_b
    invoke-direct/range {v17 .. v24}, Lce6;-><init>(Ln84;Lea6;Lb71;Ln84;Lmm0;Lq15;Lrn2;)V

    .line 954
    .line 955
    .line 956
    move-object/from16 v1, v17

    .line 957
    .line 958
    iput-object v1, v8, Lea6;->X:Ljava/lang/Object;

    .line 959
    .line 960
    invoke-virtual {v4, v1}, Lg94;->a(Lc94;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual/range {v22 .. v22}, Lmm0;->q()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 967
    if-ne v1, v6, :cond_26

    .line 968
    .line 969
    move-object v5, v6

    .line 970
    goto :goto_19

    .line 971
    :cond_26
    move-object v2, v8

    .line 972
    move-object/from16 v1, v19

    .line 973
    .line 974
    :goto_17
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v1, Lbm3;

    .line 977
    .line 978
    if-eqz v1, :cond_27

    .line 979
    .line 980
    invoke-interface {v1, v5}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 981
    .line 982
    .line 983
    :cond_27
    iget-object v1, v2, Lea6;->X:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v1, La94;

    .line 986
    .line 987
    if-eqz v1, :cond_28

    .line 988
    .line 989
    invoke-virtual {v4, v1}, Lg94;->f(Lc94;)V

    .line 990
    .line 991
    .line 992
    :cond_28
    :goto_18
    move-object v5, v0

    .line 993
    :goto_19
    return-object v5

    .line 994
    :catchall_6
    move-exception v0

    .line 995
    :goto_1a
    move-object v2, v8

    .line 996
    move-object/from16 v1, v19

    .line 997
    .line 998
    goto :goto_1b

    .line 999
    :catchall_7
    move-exception v0

    .line 1000
    move-object/from16 v19, v7

    .line 1001
    .line 1002
    goto :goto_1a

    .line 1003
    :goto_1b
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v1, Lbm3;

    .line 1006
    .line 1007
    if-eqz v1, :cond_29

    .line 1008
    .line 1009
    invoke-interface {v1, v5}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 1010
    .line 1011
    .line 1012
    :cond_29
    iget-object v1, v2, Lea6;->X:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v1, La94;

    .line 1015
    .line 1016
    if-eqz v1, :cond_2a

    .line 1017
    .line 1018
    invoke-virtual {v4, v1}, Lg94;->f(Lc94;)V

    .line 1019
    .line 1020
    .line 1021
    :cond_2a
    throw v0

    .line 1022
    :pswitch_3
    iget-object v0, v1, Lqi;->k0:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, Ljp0;

    .line 1025
    .line 1026
    sget-object v3, Lc71;->X:Lc71;

    .line 1027
    .line 1028
    iget-boolean v4, v1, Lqi;->h0:Z

    .line 1029
    .line 1030
    if-eqz v4, :cond_2c

    .line 1031
    .line 1032
    const/4 v12, 0x1

    .line 1033
    if-ne v4, v12, :cond_2b

    .line 1034
    .line 1035
    iget-object v4, v1, Lqi;->i0:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v4, Lq90;

    .line 1038
    .line 1039
    iget-object v6, v1, Lqi;->j0:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v6, Lb71;

    .line 1042
    .line 1043
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1044
    .line 1045
    .line 1046
    move-object/from16 v7, p1

    .line 1047
    .line 1048
    const/4 v12, 0x1

    .line 1049
    goto :goto_1d

    .line 1050
    :cond_2b
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1051
    .line 1052
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_1f

    .line 1056
    :cond_2c
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v4, v1, Lqi;->j0:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v4, Lb71;

    .line 1062
    .line 1063
    invoke-interface {v0}, Ljp0;->iterator()Lq90;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v6

    .line 1067
    move-object/from16 v25, v6

    .line 1068
    .line 1069
    move-object v6, v4

    .line 1070
    move-object/from16 v4, v25

    .line 1071
    .line 1072
    :goto_1c
    iput-object v6, v1, Lqi;->j0:Ljava/lang/Object;

    .line 1073
    .line 1074
    iput-object v4, v1, Lqi;->i0:Ljava/lang/Object;

    .line 1075
    .line 1076
    const/4 v12, 0x1

    .line 1077
    iput-boolean v12, v1, Lqi;->h0:Z

    .line 1078
    .line 1079
    invoke-virtual {v4, v1}, Lq90;->b(Ls51;)Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v7

    .line 1083
    if-ne v7, v3, :cond_2d

    .line 1084
    .line 1085
    move-object v5, v3

    .line 1086
    goto :goto_1f

    .line 1087
    :cond_2d
    :goto_1d
    check-cast v7, Ljava/lang/Boolean;

    .line 1088
    .line 1089
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v7

    .line 1093
    if-eqz v7, :cond_2f

    .line 1094
    .line 1095
    invoke-virtual {v4}, Lq90;->c()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v7

    .line 1099
    invoke-interface {v0}, Ljp0;->q()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v8

    .line 1103
    invoke-static {v8}, Lup0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v8

    .line 1107
    if-nez v8, :cond_2e

    .line 1108
    .line 1109
    move-object v14, v7

    .line 1110
    goto :goto_1e

    .line 1111
    :cond_2e
    move-object v14, v8

    .line 1112
    :goto_1e
    new-instance v13, Lpi;

    .line 1113
    .line 1114
    iget-object v7, v1, Lqi;->l0:Ljava/lang/Object;

    .line 1115
    .line 1116
    move-object v15, v7

    .line 1117
    check-cast v15, Loi;

    .line 1118
    .line 1119
    iget-object v7, v1, Lqi;->m0:Ljava/lang/Object;

    .line 1120
    .line 1121
    move-object/from16 v16, v7

    .line 1122
    .line 1123
    check-cast v16, Ly05;

    .line 1124
    .line 1125
    iget-object v7, v1, Lqi;->n0:Ljava/lang/Object;

    .line 1126
    .line 1127
    move-object/from16 v17, v7

    .line 1128
    .line 1129
    check-cast v17, Ly05;

    .line 1130
    .line 1131
    const/16 v18, 0x0

    .line 1132
    .line 1133
    const/16 v19, 0x0

    .line 1134
    .line 1135
    invoke-direct/range {v13 .. v19}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 1136
    .line 1137
    .line 1138
    invoke-static {v6, v5, v5, v13, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1139
    .line 1140
    .line 1141
    goto :goto_1c

    .line 1142
    :cond_2f
    sget-object v5, Ldn8;->a:Ldn8;

    .line 1143
    .line 1144
    :goto_1f
    return-object v5

    .line 1145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
