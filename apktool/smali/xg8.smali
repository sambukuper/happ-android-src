.class public final Lxg8;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lxg8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxg8;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxg8;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lxg8;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lxg8;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lxg8;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lfc8;

    .line 11
    .line 12
    check-cast v1, Lnz5;

    .line 13
    .line 14
    iget-object p0, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljl1;

    .line 17
    .line 18
    iget-object v0, p0, Ljl1;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lhl1;

    .line 21
    .line 22
    iget-object v0, v0, Lhl1;->e:Lvl;

    .line 23
    .line 24
    iget-object p0, p0, Ljl1;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lw15;

    .line 27
    .line 28
    invoke-interface {v0, v1, p0}, Ljm;->f(Lnz5;Lw15;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v4, p0

    .line 34
    check-cast v4, Lyg8;

    .line 35
    .line 36
    move-object v3, v1

    .line 37
    check-cast v3, Lgs0;

    .line 38
    .line 39
    new-instance v0, Lyg8;

    .line 40
    .line 41
    iget-object v1, v4, Lyg8;->H0:Lve4;

    .line 42
    .line 43
    iget-object v2, v4, Lyg8;->I0:Lkm1;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcw0;->getAnnotations()Lsm;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v3}, Ljo2;->r()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/4 p0, 0x0

    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    iget-object v8, v4, Lyg8;->I0:Lkm1;

    .line 57
    .line 58
    invoke-virtual {v8}, Lhd1;->getSource()Lke7;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v0 .. v7}, Lyg8;-><init>(Lve4;Lkm1;Lgs0;Lyg8;Lsm;ILke7;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lyg8;->K0:Ls18;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8}, Lkm1;->H0()Lsx4;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-nez v1, :cond_0

    .line 78
    .line 79
    move-object v1, p0

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {v8}, Lkm1;->I0()Laa7;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lwi8;->d(Lt14;)Lwi8;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_0
    if-nez v1, :cond_1

    .line 90
    .line 91
    move-object v0, p0

    .line 92
    goto :goto_2

    .line 93
    :cond_1
    iget-object v2, v3, Ljo2;->n0:Li44;

    .line 94
    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {v2, v1}, Li44;->I0(Lwi8;)Li44;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :cond_2
    move-object v7, p0

    .line 102
    invoke-virtual {v3}, Ljo2;->Y()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v2, v8

    .line 110
    new-instance v8, Ljava/util/ArrayList;

    .line 111
    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-static {p0, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Li44;

    .line 136
    .line 137
    invoke-virtual {v3, v1}, Li44;->I0(Lwi8;)Li44;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    invoke-virtual {v2}, Lkm1;->k0()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-virtual {v4}, Ljo2;->L()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    iget-object v11, v4, Ljo2;->k0:Lt14;

    .line 154
    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    sget-object v12, Lfx4;->Y:Lfx4;

    .line 159
    .line 160
    iget-object v13, v2, Lkm1;->j0:Lfl1;

    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    move-object v5, v0

    .line 164
    invoke-virtual/range {v5 .. v13}, Ljo2;->L0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    return-object v0

    .line 168
    :cond_4
    throw p0

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
