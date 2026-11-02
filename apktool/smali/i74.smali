.class public final Li74;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:I

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Li74;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Li74;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Li74;->h0:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lok7;Lq51;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Li74;->g0:B

    .line 12
    iput-object p1, p0, Li74;->i0:Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Li74;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    check-cast p2, Lq51;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p2, p1}, Li74;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Li74;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Li74;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    check-cast p1, Lb71;

    .line 31
    .line 32
    check-cast p2, Lq51;

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1}, Li74;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Li74;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Li74;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :pswitch_1
    check-cast p1, Lxx6;

    .line 45
    .line 46
    check-cast p2, Lq51;

    .line 47
    .line 48
    invoke-virtual {p0, p2, p1}, Li74;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Li74;

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Li74;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Li74;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Li74;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Li74;

    .line 9
    .line 10
    check-cast v1, Lok7;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, Li74;-><init>(Lok7;Lq51;)V

    .line 13
    .line 14
    .line 15
    check-cast p2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Li74;->h0:I

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance p2, Li74;

    .line 25
    .line 26
    check-cast v1, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 27
    .line 28
    iget p0, p0, Li74;->h0:I

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p2, v1, p0, p1, v0}, Li74;-><init>(Ljava/lang/Object;ILq51;B)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :pswitch_1
    new-instance p2, Li74;

    .line 36
    .line 37
    check-cast v1, Lj74;

    .line 38
    .line 39
    iget p0, p0, Li74;->h0:I

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p2, v1, p0, p1, v0}, Li74;-><init>(Ljava/lang/Object;ILq51;B)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Li74;->g0:B

    .line 2
    .line 3
    const-string v1, "binding"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    iget-object v4, p0, Li74;->i0:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget p0, p0, Li74;->h0:I

    .line 15
    .line 16
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast v4, Lok7;

    .line 20
    .line 21
    iget-object p1, v4, Lok7;->t1:Lwk2;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    if-nez p0, :cond_3

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object p0, p1, Lwk2;->o0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, v4, Lok7;->t1:Lwk2;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Lwk2;->p0:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v4, Lok7;->t1:Lwk2;

    .line 50
    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    iget-object p0, p0, Lwk2;->m0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v5

    .line 66
    :cond_1
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v5

    .line 70
    :cond_2
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v5

    .line 74
    :cond_3
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iget-object p0, p1, Lwk2;->m0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    iget-object p0, v4, Lok7;->t1:Lwk2;

    .line 85
    .line 86
    if-eqz p0, :cond_5

    .line 87
    .line 88
    iget-object p0, p0, Lwk2;->o0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    iget-object p0, v4, Lok7;->t1:Lwk2;

    .line 97
    .line 98
    if-eqz p0, :cond_4

    .line 99
    .line 100
    iget-object p0, p0, Lwk2;->p0:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    :goto_0
    return-object v3

    .line 109
    :cond_4
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v5

    .line 113
    :cond_5
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v5

    .line 117
    :cond_6
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    check-cast v4, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 125
    .line 126
    iget-object p1, v4, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->Q0:Lc6;

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    iget-object p1, p1, Lc6;->k0:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Landroid/view/View;

    .line 133
    .line 134
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 135
    .line 136
    iget p0, p0, Li74;->h0:I

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 139
    .line 140
    .line 141
    return-object v3

    .line 142
    :cond_7
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v5

    .line 146
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    check-cast v4, Lj74;

    .line 150
    .line 151
    iget p0, p0, Li74;->h0:I

    .line 152
    .line 153
    iget-object p1, v4, Lj74;->g0:Lwg;

    .line 154
    .line 155
    iget-object v0, p1, Lwg;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Loh5;

    .line 158
    .line 159
    invoke-virtual {v0}, Loh5;->l()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-ne v0, p0, :cond_8

    .line 164
    .line 165
    iget-object v0, p1, Lwg;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Loh5;

    .line 168
    .line 169
    invoke-virtual {v0}, Loh5;->l()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    :cond_8
    iget-object v0, v4, Lj74;->p0:Ld64;

    .line 176
    .line 177
    invoke-virtual {v0}, Ld64;->d()V

    .line 178
    .line 179
    .line 180
    iput-object v5, v0, Ld64;->b:Lne;

    .line 181
    .line 182
    const/4 v1, -0x1

    .line 183
    iput v1, v0, Ld64;->c:I

    .line 184
    .line 185
    :cond_9
    invoke-virtual {p1, p0, v2}, Lwg;->B(II)V

    .line 186
    .line 187
    .line 188
    iput-object v5, p1, Lwg;->d:Ljava/lang/Object;

    .line 189
    .line 190
    iget-object p0, v4, Lj74;->m0:Landroidx/compose/ui/node/LayoutNode;

    .line 191
    .line 192
    if-eqz p0, :cond_a

    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->k()V

    .line 195
    .line 196
    .line 197
    :cond_a
    return-object v3

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
