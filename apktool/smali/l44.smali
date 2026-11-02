.class public final Ll44;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lm44;


# direct methods
.method public synthetic constructor <init>(Lm44;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ll44;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ll44;->Y:Lm44;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Ll44;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ll44;->Y:Lm44;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lm44;->b:Lja6;

    .line 10
    .line 11
    invoke-virtual {v0}, Lja6;->b()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lka6;

    .line 35
    .line 36
    iget-object v4, v3, Lka6;->a:Lv15;

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lks3;->b:Lv15;

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, v3}, Lm44;->a(Lka6;)Ls21;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    new-instance v5, Lqg5;

    .line 49
    .line 50
    invoke-direct {v5, v4, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v5, v1

    .line 55
    :goto_1
    if-eqz v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v2}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_0
    invoke-virtual {p0}, Lm44;->d()Lfk2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v2, p0, Lm44;->b:Lja6;

    .line 71
    .line 72
    iget-object p0, p0, Lm44;->a:Lz47;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2}, Lja6;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    filled-new-array {p0}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object v0, Ls32;->G0:Ls32;

    .line 85
    .line 86
    invoke-static {v0, p0}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Lc6;

    .line 94
    .line 95
    iget-object v3, p0, Lc6;->n0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lwx4;

    .line 98
    .line 99
    iget-object v3, v3, Lwx4;->h0:Lzz3;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v4, Lll3;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0}, Lll3;->g(Lfk2;)Lqs0;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eqz v4, :cond_5

    .line 111
    .line 112
    invoke-virtual {v4}, Lqs0;->a()Lfk2;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v3, v4}, Lzz3;->j(Lfk2;)Lsx4;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move-object v3, v1

    .line 122
    :goto_2
    if-nez v3, :cond_7

    .line 123
    .line 124
    new-instance v3, Lta6;

    .line 125
    .line 126
    iget-object v2, v2, Lja6;->a:Ljava/lang/annotation/Annotation;

    .line 127
    .line 128
    invoke-static {v2}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-direct {v3, v2}, Lta6;-><init>(Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lc6;->l0:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Llr5;

    .line 142
    .line 143
    iget-object v2, v2, Llr5;->Y:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, Lq02;

    .line 146
    .line 147
    if-eqz v2, :cond_6

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Lq02;->R(Lta6;)Lsx4;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-nez v3, :cond_7

    .line 154
    .line 155
    iget-object v1, p0, Lc6;->n0:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lwx4;

    .line 158
    .line 159
    new-instance v2, Lqs0;

    .line 160
    .line 161
    invoke-virtual {v0}, Lfk2;->b()Lfk2;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 166
    .line 167
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {v2, v3, v0}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 172
    .line 173
    .line 174
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lzl1;

    .line 177
    .line 178
    invoke-virtual {p0}, Lzl1;->c()Lhl1;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iget-object p0, p0, Lhl1;->l:Lz47;

    .line 183
    .line 184
    invoke-static {v1, v2, p0}, Loc;->o(Lvx4;Lqs0;Lz47;)Lsx4;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    goto :goto_3

    .line 189
    :cond_6
    const-string p0, "resolver"

    .line 190
    .line 191
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v1

    .line 195
    :cond_7
    :goto_3
    invoke-virtual {v3}, Lsx4;->X()Laa7;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    :goto_4
    return-object p0

    .line 200
    :pswitch_1
    iget-object p0, p0, Lm44;->b:Lja6;

    .line 201
    .line 202
    iget-object p0, p0, Lja6;->a:Ljava/lang/annotation/Annotation;

    .line 203
    .line 204
    invoke-static {p0}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {p0}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
