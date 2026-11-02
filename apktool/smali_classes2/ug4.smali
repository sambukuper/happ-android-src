.class public final Lug4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:Landroid/content/Context;

.field public final synthetic Y:Lky2;

.field public final synthetic Z:Landroid/content/res/Resources;

.field public final synthetic f0:Landroid/app/Activity;

.field public final synthetic g0:Lng4;

.field public final synthetic h0:Lj74;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lky2;Landroid/content/res/Resources;Landroid/app/Activity;Lng4;Lj74;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lug4;->X:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lug4;->Y:Lky2;

    .line 7
    .line 8
    iput-object p3, p0, Lug4;->Z:Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p4, p0, Lug4;->f0:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lug4;->g0:Lng4;

    .line 13
    .line 14
    iput-object p6, p0, Lug4;->h0:Lj74;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ltg4;

    .line 2
    .line 3
    instance-of v0, p1, Log4;

    .line 4
    .line 5
    sget-object v1, Lc71;->X:Lc71;

    .line 6
    .line 7
    iget-object v2, p0, Lug4;->Z:Landroid/content/res/Resources;

    .line 8
    .line 9
    iget-object v3, p0, Lug4;->Y:Lky2;

    .line 10
    .line 11
    sget-object v4, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lss8;->a:Lss8;

    .line 16
    .line 17
    check-cast p1, Log4;

    .line 18
    .line 19
    iget-object p1, p1, Log4;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p0, p0, Lug4;->X:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lss8;->E(Landroid/content/Context;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lby2;

    .line 27
    .line 28
    sget p1, Ly46;->toast_copied_to_clipboard:I

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lmy2;->X:Lmy2;

    .line 38
    .line 39
    invoke-direct {p0, p1, v0}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p0, p2}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v1, :cond_7

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_0
    instance-of v0, p1, Lqg4;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    check-cast p1, Lqg4;

    .line 54
    .line 55
    iget-object p1, p1, Lqg4;->a:Ljava/lang/String;

    .line 56
    .line 57
    iget-object p0, p0, Lug4;->f0:Landroid/app/Activity;

    .line 58
    .line 59
    invoke-static {p0, v2, v3, p1, p2}, Ljb5;->B(Landroid/app/Activity;Landroid/content/res/Resources;Lky2;Ljava/lang/String;Lq51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v1, :cond_7

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_1
    instance-of v0, p1, Lrg4;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    new-instance p0, Lby2;

    .line 71
    .line 72
    sget p1, Ly46;->logs_view_warning_encrypted:I

    .line 73
    .line 74
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v0, Lmy2;->Z:Lmy2;

    .line 82
    .line 83
    invoke-direct {p0, p1, v0}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p0, p2}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-ne p0, v1, :cond_7

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_2
    instance-of v0, p1, Lsg4;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    new-instance p0, Lby2;

    .line 98
    .line 99
    sget p1, Ly46;->toast_failure:I

    .line 100
    .line 101
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v0, Lmy2;->Y:Lmy2;

    .line 109
    .line 110
    invoke-direct {p0, p1, v0}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, p0, p2}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v1, :cond_7

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_3
    instance-of p1, p1, Lpg4;

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    if-eqz p1, :cond_8

    .line 124
    .line 125
    iget-object p1, p0, Lug4;->g0:Lng4;

    .line 126
    .line 127
    instance-of v2, p1, Llg4;

    .line 128
    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    move-object v0, p1

    .line 132
    check-cast v0, Llg4;

    .line 133
    .line 134
    :cond_4
    if-eqz v0, :cond_6

    .line 135
    .line 136
    iget-object p1, v0, Llg4;->e:Lj2;

    .line 137
    .line 138
    if-nez p1, :cond_5

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    invoke-virtual {p1}, Lz0;->a()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    add-int/lit8 p1, p1, -0x1

    .line 146
    .line 147
    iget-object p0, p0, Lug4;->h0:Lj74;

    .line 148
    .line 149
    invoke-static {p0, p1, p2}, Lj74;->f(Lj74;ILq51;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v1, :cond_6

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    :goto_0
    move-object p0, v4

    .line 157
    :goto_1
    if-ne p0, v1, :cond_7

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_7
    return-object v4

    .line 161
    :cond_8
    invoke-static {}, Lb61;->c()V

    .line 162
    .line 163
    .line 164
    return-object v0
.end method
