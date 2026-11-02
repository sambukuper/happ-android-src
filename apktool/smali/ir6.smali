.class public abstract Lir6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lqs0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfk2;

    .line 2
    .line 3
    const-string v1, "java.lang.Void"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqs0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lfk2;->b()Lfk2;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 15
    .line 16
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v1, v2, v0}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lir6;->a:Lqs0;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Lho2;)Ljt3;
    .locals 4

    .line 1
    new-instance v0, Ljt3;

    .line 2
    .line 3
    new-instance v1, Llt3;

    .line 4
    .line 5
    invoke-static {p0}, Lgv3;->y(Lho2;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    instance-of v2, p0, Lhx5;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lel1;->i(Lld0;)Lld0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Led1;->getName()Lv15;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Ljs3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v2, p0, Ltx5;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {p0}, Lel1;->i(Lld0;)Lld0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Led1;->getName()Lv15;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Ljs3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v2, p0

    .line 60
    check-cast v2, Lfd1;

    .line 61
    .line 62
    invoke-virtual {v2}, Lfd1;->getName()Lv15;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 74
    invoke-static {p0, v3}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v1, v2, p0}, Llt3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljt3;-><init>(Llt3;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public static b(Lfx5;)Ljm4;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lbl1;->r(Lld0;)Lld0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lfx5;

    .line 9
    .line 10
    invoke-interface {p0}, Lfx5;->a()Lfx5;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of p0, v1, Lim1;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    move-object p0, v1

    .line 23
    check-cast p0, Lim1;

    .line 24
    .line 25
    iget-object v2, p0, Lim1;->E0:Lcz5;

    .line 26
    .line 27
    sget-object v3, Llu3;->d:Laq2;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lch3;->y(Lyp2;Laq2;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lfu3;

    .line 37
    .line 38
    if-eqz v3, :cond_a

    .line 39
    .line 40
    new-instance v0, Lyt3;

    .line 41
    .line 42
    iget-object v4, p0, Lim1;->F0:Lw15;

    .line 43
    .line 44
    iget-object v5, p0, Lim1;->G0:Lux4;

    .line 45
    .line 46
    invoke-direct/range {v0 .. v5}, Lyt3;-><init>(Lfx5;Lcz5;Lfu3;Lw15;Lux4;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_0
    instance-of p0, v1, Lgl3;

    .line 51
    .line 52
    if-eqz p0, :cond_a

    .line 53
    .line 54
    move-object p0, v1

    .line 55
    check-cast p0, Lgl3;

    .line 56
    .line 57
    invoke-virtual {p0}, Lhd1;->getSource()Lke7;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    instance-of v3, v2, Lhr6;

    .line 62
    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    check-cast v2, Lhr6;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object v2, v0

    .line 69
    :goto_0
    if-eqz v2, :cond_2

    .line 70
    .line 71
    iget-object v2, v2, Lhr6;->X:Lxa6;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v2, v0

    .line 75
    :goto_1
    instance-of v3, v2, Lza6;

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    new-instance p0, Lwt3;

    .line 80
    .line 81
    check-cast v2, Lza6;

    .line 82
    .line 83
    iget-object v0, v2, Lza6;->a:Ljava/lang/reflect/Field;

    .line 84
    .line 85
    invoke-direct {p0, v0}, Lwt3;-><init>(Ljava/lang/reflect/Field;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_3
    instance-of v3, v2, Lcb6;

    .line 90
    .line 91
    if-eqz v3, :cond_9

    .line 92
    .line 93
    new-instance v1, Lxt3;

    .line 94
    .line 95
    check-cast v2, Lcb6;

    .line 96
    .line 97
    iget-object v2, v2, Lcb6;->a:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    iget-object p0, p0, Lgx5;->B0:Ltx5;

    .line 100
    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Lhd1;->getSource()Lke7;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object p0, v0

    .line 109
    :goto_2
    instance-of v3, p0, Lhr6;

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    check-cast p0, Lhr6;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move-object p0, v0

    .line 117
    :goto_3
    if-eqz p0, :cond_6

    .line 118
    .line 119
    iget-object p0, p0, Lhr6;->X:Lxa6;

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    move-object p0, v0

    .line 123
    :goto_4
    instance-of v3, p0, Lcb6;

    .line 124
    .line 125
    if-eqz v3, :cond_7

    .line 126
    .line 127
    check-cast p0, Lcb6;

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    move-object p0, v0

    .line 131
    :goto_5
    if-eqz p0, :cond_8

    .line 132
    .line 133
    iget-object v0, p0, Lcb6;->a:Ljava/lang/reflect/Method;

    .line 134
    .line 135
    :cond_8
    invoke-direct {v1, v2, v0}, Lxt3;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_9
    const-string p0, "Incorrect resolution sequence for Java field "

    .line 140
    .line 141
    const-string v3, " (source = "

    .line 142
    .line 143
    invoke-static {p0, v1, v3, v2}, Lom0;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_a
    invoke-interface {v1}, Lfx5;->b()Lhx5;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {p0}, Lir6;->a(Lho2;)Ljt3;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-interface {v1}, Lfx5;->d()Ltx5;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-eqz v1, :cond_b

    .line 163
    .line 164
    invoke-static {v1}, Lir6;->a(Lho2;)Ljt3;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :cond_b
    new-instance v1, Lzt3;

    .line 169
    .line 170
    invoke-direct {v1, p0, v0}, Lzt3;-><init>(Ljt3;Ljt3;)V

    .line 171
    .line 172
    .line 173
    return-object v1
.end method

.method public static c(Lho2;)Ldh3;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lbl1;->r(Lld0;)Lld0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lho2;

    .line 9
    .line 10
    invoke-interface {v0}, Lho2;->a()Lho2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v1, v0, Lml1;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Lam1;

    .line 23
    .line 24
    invoke-interface {v1}, Lam1;->x()Ld2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v3, v2, Lvy5;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    sget-object v3, Lmu3;->a:Lr62;

    .line 33
    .line 34
    move-object v3, v2

    .line 35
    check-cast v3, Lvy5;

    .line 36
    .line 37
    invoke-interface {v1}, Lam1;->M()Lw15;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v1}, Lam1;->G()Lux4;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v3, v4, v5}, Lmu3;->c(Lvy5;Lw15;Lux4;)Llt3;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    new-instance p0, Ljt3;

    .line 52
    .line 53
    invoke-direct {p0, v3}, Ljt3;-><init>(Llt3;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_0
    instance-of v3, v2, Liy5;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    sget-object v3, Lmu3;->a:Lr62;

    .line 62
    .line 63
    check-cast v2, Liy5;

    .line 64
    .line 65
    invoke-interface {v1}, Lam1;->M()Lw15;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v1}, Lam1;->G()Lux4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v2, v3, v1}, Lmu3;->a(Liy5;Lw15;Lux4;)Llt3;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {p0}, Led1;->p()Led1;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Lbd3;->a(Led1;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    new-instance p0, Ljt3;

    .line 93
    .line 94
    invoke-direct {p0, v1}, Ljt3;-><init>(Llt3;)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_1
    new-instance p0, Lit3;

    .line 99
    .line 100
    invoke-direct {p0, v1}, Lit3;-><init>(Llt3;)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_2
    invoke-static {v0}, Lir6;->a(Lho2;)Ljt3;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_3
    instance-of p0, v0, Ldl3;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    if-eqz p0, :cond_8

    .line 113
    .line 114
    move-object p0, v0

    .line 115
    check-cast p0, Ldl3;

    .line 116
    .line 117
    invoke-virtual {p0}, Lhd1;->getSource()Lke7;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    instance-of v2, p0, Lhr6;

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    check-cast p0, Lhr6;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    move-object p0, v1

    .line 129
    :goto_0
    if-eqz p0, :cond_5

    .line 130
    .line 131
    iget-object p0, p0, Lhr6;->X:Lxa6;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move-object p0, v1

    .line 135
    :goto_1
    instance-of v2, p0, Lcb6;

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    check-cast p0, Lcb6;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    move-object p0, v1

    .line 143
    :goto_2
    if-eqz p0, :cond_7

    .line 144
    .line 145
    iget-object p0, p0, Lcb6;->a:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    new-instance v0, Lht3;

    .line 148
    .line 149
    invoke-direct {v0, p0}, Lht3;-><init>(Ljava/lang/reflect/Method;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_7
    const-string p0, "Incorrect resolution sequence for Java method "

    .line 154
    .line 155
    invoke-static {v0, p0}, Lxw3;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_8
    instance-of p0, v0, Lyj3;

    .line 160
    .line 161
    if-eqz p0, :cond_d

    .line 162
    .line 163
    move-object p0, v0

    .line 164
    check-cast p0, Lyj3;

    .line 165
    .line 166
    invoke-virtual {p0}, Lhd1;->getSource()Lke7;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    instance-of v2, p0, Lhr6;

    .line 171
    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    check-cast p0, Lhr6;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    move-object p0, v1

    .line 178
    :goto_3
    if-eqz p0, :cond_a

    .line 179
    .line 180
    iget-object p0, p0, Lhr6;->X:Lxa6;

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    move-object p0, v1

    .line 184
    :goto_4
    instance-of v2, p0, Lwa6;

    .line 185
    .line 186
    if-eqz v2, :cond_b

    .line 187
    .line 188
    new-instance v0, Lgt3;

    .line 189
    .line 190
    check-cast p0, Lwa6;

    .line 191
    .line 192
    iget-object p0, p0, Lwa6;->a:Ljava/lang/reflect/Constructor;

    .line 193
    .line 194
    invoke-direct {v0, p0}, Lgt3;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_b
    instance-of v2, p0, Lta6;

    .line 199
    .line 200
    if-eqz v2, :cond_c

    .line 201
    .line 202
    move-object v2, p0

    .line 203
    check-cast v2, Lta6;

    .line 204
    .line 205
    iget-object v2, v2, Lta6;->a:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_c

    .line 212
    .line 213
    new-instance p0, Lft3;

    .line 214
    .line 215
    invoke-direct {p0, v2}, Lft3;-><init>(Ljava/lang/Class;)V

    .line 216
    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_c
    const-string v2, "Incorrect resolution sequence for Java constructor "

    .line 220
    .line 221
    const-string v3, " ("

    .line 222
    .line 223
    invoke-static {v2, v0, v3, p0}, Lom0;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object v1

    .line 227
    :cond_d
    invoke-static {v0}, Lir6;->a(Lho2;)Ljt3;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0
.end method
