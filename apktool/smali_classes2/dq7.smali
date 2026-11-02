.class public final synthetic Ldq7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lkq7;

.field public final synthetic Z:Lrv7;


# direct methods
.method public synthetic constructor <init>(Lkq7;Lrv7;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ldq7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ldq7;->Y:Lkq7;

    .line 4
    .line 5
    iput-object p2, p0, Ldq7;->Z:Lrv7;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, Ldq7;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Ldq7;->Z:Lrv7;

    .line 5
    .line 6
    iget-object p0, p0, Ldq7;->Y:Lkq7;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lkq7;->h:Lgn2;

    .line 12
    .line 13
    iget-object p1, v1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 14
    .line 15
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Lkq7;->d:Lvj4;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Lvj4;->a:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 33
    .line 34
    new-instance v2, Landroid/view/animation/RotateAnimation;

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    const/high16 v8, 0x3f000000    # 0.5f

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/high16 v4, 0x44340000    # 720.0f

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    const/high16 v6, 0x3f000000    # 0.5f

    .line 44
    .line 45
    invoke-direct/range {v2 .. v8}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 49
    .line 50
    invoke-direct {v3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v3, 0xbb8

    .line 57
    .line 58
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    iget-object p1, p1, Lb6;->j0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-string p0, "binding"

    .line 75
    .line 76
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0

    .line 81
    :cond_1
    :goto_0
    iget-object p0, p0, Lkq7;->c:Lgv7;

    .line 82
    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    iget-object p1, v1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 86
    .line 87
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->X(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    return-void

    .line 97
    :pswitch_1
    iget-object p0, p0, Lkq7;->d:Lvj4;

    .line 98
    .line 99
    if-eqz p0, :cond_5

    .line 100
    .line 101
    iget-object p1, v1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 102
    .line 103
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    const/4 v2, 0x1

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    move v2, v0

    .line 116
    :goto_1
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-static {v0, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    :cond_4
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Lvj4;->a:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 144
    .line 145
    new-instance v3, Lin1;

    .line 146
    .line 147
    invoke-direct {v3}, Lin1;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v4, Landroid/os/Bundle;

    .line 151
    .line 152
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v5, "sub_id"

    .line 156
    .line 157
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const-string v1, "is_sub_config_group"

    .line 161
    .line 162
    invoke-virtual {v4, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 163
    .line 164
    .line 165
    const-string v1, "is_empty_config_group"

    .line 166
    .line 167
    invoke-virtual {v4, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 168
    .line 169
    .line 170
    const-string p1, "is_restricted_access"

    .line 171
    .line 172
    invoke-virtual {v4, p1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v4}, Lqk2;->Q(Landroid/os/Bundle;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    const-string p1, "DialogConfigGroupActionsFragment"

    .line 183
    .line 184
    invoke-virtual {v3, p0, p1}, Lsn1;->X(Lml2;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    return-void

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
