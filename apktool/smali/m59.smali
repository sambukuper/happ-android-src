.class public abstract Lm59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm59;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Landroidx/compose/ui/platform/AbstractComposeView;Lxz0;Lzy0;)Lh59;
    .locals 7

    .line 1
    sget-object v0, Lfs2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    invoke-static {v2, v3, v3, v0}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v4, Lyh;->o0:Lvz7;

    .line 18
    .line 19
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ls61;

    .line 24
    .line 25
    invoke-static {v4}, Lgv3;->c(Ls61;)Lm51;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, Lr0;

    .line 30
    .line 31
    invoke-direct {v5, v0, v3}, Lr0;-><init>(Lx90;Lq51;)V

    .line 32
    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    invoke-static {v4, v3, v3, v5, v6}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 36
    .line 37
    .line 38
    new-instance v4, Lvj2;

    .line 39
    .line 40
    invoke-direct {v4, v0, v2}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkd7;->c:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v0

    .line 46
    :try_start_0
    sget-object v5, Lkd7;->i:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v5, v4}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    sput-object v4, Lkd7;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    monitor-exit v0

    .line 55
    invoke-static {}, Lkd7;->c()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    monitor-exit v0

    .line 61
    throw p0

    .line 62
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-lez v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v0, v3

    .line 80
    :goto_1
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setComposeViewContext(Lxz0;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    :goto_2
    move-object v0, v3

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :goto_3
    if-nez v0, :cond_4

    .line 93
    .line 94
    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-direct {v0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;-><init>(Landroid/content/Context;Lxz0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v4, Lm59;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    invoke-virtual {p0, v1, v4}, Landroidx/compose/ui/platform/AbstractComposeView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setComposeViewContext(Lxz0;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->getComposeViewContext$ui()Lxz0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-virtual {p1}, Lxz0;->e()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->setComposeViewContextIncrementedDuringInit$ui(Z)V

    .line 125
    .line 126
    .line 127
    :cond_5
    sget p0, Lg46;->wrapped_composition_tag:I

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    instance-of v1, p0, Lh59;

    .line 134
    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    move-object v3, p0

    .line 138
    check-cast v3, Lh59;

    .line 139
    .line 140
    :cond_6
    if-nez v3, :cond_7

    .line 141
    .line 142
    new-instance v3, Lh59;

    .line 143
    .line 144
    new-instance p0, Lml8;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Landroidx/compose/ui/node/LayoutNode;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {p0, v1}, Lml8;-><init>(Landroidx/compose/ui/node/LayoutNode;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lxz0;->c()Lm01;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    new-instance v2, Lr01;

    .line 158
    .line 159
    invoke-direct {v2, v1, p0}, Lr01;-><init>(Lm01;Lml8;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v3, v0, v2}, Lh59;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lr01;)V

    .line 163
    .line 164
    .line 165
    sget p0, Lg46;->wrapped_composition_tag:I

    .line 166
    .line 167
    invoke-virtual {v0, p0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-virtual {v3, p2}, Lh59;->b(Lrn2;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Lxz0;->c()Lm01;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance p1, Ll59;

    .line 178
    .line 179
    invoke-direct {p1, p0}, Ll59;-><init>(Lm01;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setFrameEndScheduler$ui(Li94;)V

    .line 183
    .line 184
    .line 185
    return-object v3
.end method
