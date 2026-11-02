.class public final Lwj7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lxj7;


# direct methods
.method public synthetic constructor <init>(Lxj7;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lwj7;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lwj7;->i0:Lxj7;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lwj7;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lwj7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lwj7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lwj7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lwj7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lwj7;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lwj7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lwj7;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lwj7;->i0:Lxj7;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lwj7;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lwj7;-><init>(Lxj7;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lwj7;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lwj7;-><init>(Lxj7;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lwj7;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lc71;->X:Lc71;

    .line 9
    .line 10
    iget-object v5, p0, Lwj7;->i0:Lxj7;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lwj7;->h0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v5, Lxj7;->b:Lvz7;

    .line 35
    .line 36
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lmn6;

    .line 41
    .line 42
    invoke-virtual {p1}, Lmn6;->c()V

    .line 43
    .line 44
    .line 45
    iget-object p1, v5, Lxj7;->a:Lvz7;

    .line 46
    .line 47
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lqc2;

    .line 52
    .line 53
    iput-boolean v6, p0, Lwj7;->h0:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lqc2;->b(Ls51;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v4, :cond_2

    .line 60
    .line 61
    move-object v1, v4

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    iget-object p0, v5, Lxj7;->c:Lvz7;

    .line 64
    .line 65
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lkf4;

    .line 70
    .line 71
    invoke-virtual {p0}, Lkf4;->i()V

    .line 72
    .line 73
    .line 74
    iget-object p0, v5, Lxj7;->d:Lvz7;

    .line 75
    .line 76
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/io/File;

    .line 81
    .line 82
    invoke-static {p0}, Lda2;->R(Ljava/io/File;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkw4;->a:Lkw4;

    .line 86
    .line 87
    invoke-static {}, Lkw4;->h()Lcom/tencent/mmkv/MMKV;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lkw4;->m()Lcom/tencent/mmkv/MMKV;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lkw4;->j()Lcom/tencent/mmkv/MMKV;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkw4;->d:Lvz7;

    .line 109
    .line 110
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lkw4;->i()Lcom/tencent/mmkv/MMKV;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkw4;->h:Lvz7;

    .line 134
    .line 135
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 145
    .line 146
    .line 147
    :goto_1
    return-object v1

    .line 148
    :pswitch_0
    iget-boolean v0, p0, Lwj7;->h0:Z

    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    if-ne v0, v6, :cond_3

    .line 153
    .line 154
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    move-object v1, v2

    .line 162
    goto :goto_3

    .line 163
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object p1, v5, Lxj7;->b:Lvz7;

    .line 167
    .line 168
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Lmn6;

    .line 173
    .line 174
    invoke-virtual {p1}, Lmn6;->c()V

    .line 175
    .line 176
    .line 177
    iget-object p1, v5, Lxj7;->a:Lvz7;

    .line 178
    .line 179
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Lqc2;

    .line 184
    .line 185
    iput-boolean v6, p0, Lwj7;->h0:Z

    .line 186
    .line 187
    invoke-virtual {p1, p0}, Lqc2;->b(Ls51;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-ne p0, v4, :cond_5

    .line 192
    .line 193
    move-object v1, v4

    .line 194
    goto :goto_3

    .line 195
    :cond_5
    :goto_2
    iget-object p0, v5, Lxj7;->c:Lvz7;

    .line 196
    .line 197
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Lkf4;

    .line 202
    .line 203
    invoke-virtual {p0}, Lkf4;->i()V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkw4;->a:Lkw4;

    .line 207
    .line 208
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    .line 213
    .line 214
    .line 215
    :goto_3
    return-object v1

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
