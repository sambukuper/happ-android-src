.class public final Lj09;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lo15;

.field public h0:Lsu/happ/proxyutility/receiver/WidgetProvider;

.field public i0:Landroid/content/Context;

.field public j0:Landroid/appwidget/AppWidgetManager;

.field public k0:[I

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public o0:B

.field public final synthetic p0:Lsu/happ/proxyutility/receiver/WidgetProvider;

.field public final synthetic q0:Landroid/content/Context;

.field public final synthetic r0:Landroid/appwidget/AppWidgetManager;

.field public final synthetic s0:[I

.field public final synthetic t0:Z

.field public final synthetic u0:Z

.field public final synthetic v0:Z


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/receiver/WidgetProvider;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[IZZZLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj09;->p0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 2
    .line 3
    iput-object p2, p0, Lj09;->q0:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lj09;->r0:Landroid/appwidget/AppWidgetManager;

    .line 6
    .line 7
    iput-object p4, p0, Lj09;->s0:[I

    .line 8
    .line 9
    iput-boolean p5, p0, Lj09;->t0:Z

    .line 10
    .line 11
    iput-boolean p6, p0, Lj09;->u0:Z

    .line 12
    .line 13
    iput-boolean p7, p0, Lj09;->v0:Z

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Luy7;-><init>(ILq51;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lj09;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lj09;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lj09;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 9

    .line 1
    new-instance v0, Lj09;

    .line 2
    .line 3
    iget-boolean v6, p0, Lj09;->u0:Z

    .line 4
    .line 5
    iget-boolean v7, p0, Lj09;->v0:Z

    .line 6
    .line 7
    iget-object v1, p0, Lj09;->p0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 8
    .line 9
    iget-object v2, p0, Lj09;->q0:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lj09;->r0:Landroid/appwidget/AppWidgetManager;

    .line 12
    .line 13
    iget-object v4, p0, Lj09;->s0:[I

    .line 14
    .line 15
    iget-boolean v5, p0, Lj09;->t0:Z

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    invoke-direct/range {v0 .. v8}, Lj09;-><init>(Lsu/happ/proxyutility/receiver/WidgetProvider;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[IZZZLq51;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lj09;->o0:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lc71;->X:Lc71;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lj09;->g0:Lo15;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    iget-boolean v0, p0, Lj09;->n0:Z

    .line 32
    .line 33
    iget-boolean v2, p0, Lj09;->m0:Z

    .line 34
    .line 35
    iget-boolean v5, p0, Lj09;->l0:Z

    .line 36
    .line 37
    iget-object v6, p0, Lj09;->k0:[I

    .line 38
    .line 39
    iget-object v7, p0, Lj09;->j0:Landroid/appwidget/AppWidgetManager;

    .line 40
    .line 41
    iget-object v8, p0, Lj09;->i0:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v9, p0, Lj09;->h0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 44
    .line 45
    iget-object v10, p0, Lj09;->g0:Lo15;

    .line 46
    .line 47
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p1, v8

    .line 51
    move v8, v5

    .line 52
    move-object v5, p1

    .line 53
    move-object p1, v7

    .line 54
    move-object v7, v6

    .line 55
    move-object v6, p1

    .line 56
    move-object p1, v10

    .line 57
    move v10, v0

    .line 58
    move-object v0, v9

    .line 59
    move v9, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lsu/happ/proxyutility/receiver/WidgetProvider;->a:Lq15;

    .line 65
    .line 66
    iput-object p1, p0, Lj09;->g0:Lo15;

    .line 67
    .line 68
    iget-object v9, p0, Lj09;->p0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 69
    .line 70
    iput-object v9, p0, Lj09;->h0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 71
    .line 72
    iget-object v8, p0, Lj09;->q0:Landroid/content/Context;

    .line 73
    .line 74
    iput-object v8, p0, Lj09;->i0:Landroid/content/Context;

    .line 75
    .line 76
    iget-object v7, p0, Lj09;->r0:Landroid/appwidget/AppWidgetManager;

    .line 77
    .line 78
    iput-object v7, p0, Lj09;->j0:Landroid/appwidget/AppWidgetManager;

    .line 79
    .line 80
    iget-object v6, p0, Lj09;->s0:[I

    .line 81
    .line 82
    iput-object v6, p0, Lj09;->k0:[I

    .line 83
    .line 84
    iget-boolean v5, p0, Lj09;->t0:Z

    .line 85
    .line 86
    iput-boolean v5, p0, Lj09;->l0:Z

    .line 87
    .line 88
    iget-boolean v0, p0, Lj09;->u0:Z

    .line 89
    .line 90
    iput-boolean v0, p0, Lj09;->m0:Z

    .line 91
    .line 92
    iget-boolean v10, p0, Lj09;->v0:Z

    .line 93
    .line 94
    iput-boolean v10, p0, Lj09;->n0:Z

    .line 95
    .line 96
    iput-byte v2, p0, Lj09;->o0:B

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-ne v2, v4, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    move-object v11, v9

    .line 106
    move v9, v0

    .line 107
    move-object v0, v11

    .line 108
    move-object v11, v8

    .line 109
    move v8, v5

    .line 110
    move-object v5, v11

    .line 111
    move-object v11, v7

    .line 112
    move-object v7, v6

    .line 113
    move-object v6, v11

    .line 114
    :goto_0
    :try_start_1
    sget-object v2, Lsu/happ/proxyutility/receiver/WidgetProvider;->a:Lq15;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static/range {v5 .. v10}, Lsu/happ/proxyutility/receiver/WidgetProvider;->a(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[IZZZ)V

    .line 120
    .line 121
    .line 122
    if-eqz v10, :cond_5

    .line 123
    .line 124
    sget-object v0, Lgx1;->Y:Lbe;

    .line 125
    .line 126
    sget-object v0, Llx1;->Z:Llx1;

    .line 127
    .line 128
    const/16 v2, 0x3e8

    .line 129
    .line 130
    invoke-static {v2, v0}, Lvj8;->l0(ILlx1;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    iput-object p1, p0, Lj09;->g0:Lo15;

    .line 135
    .line 136
    iput-object v3, p0, Lj09;->h0:Lsu/happ/proxyutility/receiver/WidgetProvider;

    .line 137
    .line 138
    iput-object v3, p0, Lj09;->i0:Landroid/content/Context;

    .line 139
    .line 140
    iput-object v3, p0, Lj09;->j0:Landroid/appwidget/AppWidgetManager;

    .line 141
    .line 142
    iput-object v3, p0, Lj09;->k0:[I

    .line 143
    .line 144
    iput-byte v1, p0, Lj09;->o0:B

    .line 145
    .line 146
    invoke-static {v5, v6, p0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    if-ne p0, v4, :cond_4

    .line 151
    .line 152
    :goto_1
    return-object v4

    .line 153
    :cond_4
    move-object p0, p1

    .line 154
    :goto_2
    move-object p1, p0

    .line 155
    goto :goto_3

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    move-object p0, v0

    .line 158
    move-object v11, p1

    .line 159
    move-object p1, p0

    .line 160
    move-object p0, v11

    .line 161
    goto :goto_4

    .line 162
    :cond_5
    :goto_3
    invoke-interface {p1, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Ldn8;->a:Ldn8;

    .line 166
    .line 167
    return-object p0

    .line 168
    :goto_4
    invoke-interface {p0, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    throw p1
.end method
