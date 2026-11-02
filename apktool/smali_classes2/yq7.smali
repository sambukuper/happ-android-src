.class public final Lyq7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:Ldn2;

.field public final synthetic Y:Ltn2;

.field public final synthetic Z:Lky2;

.field public final synthetic f0:Landroid/content/Context;

.field public final synthetic g0:Lrn2;


# direct methods
.method public constructor <init>(Ldn2;Ltn2;Lky2;Landroid/content/Context;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyq7;->X:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lyq7;->Y:Ltn2;

    .line 7
    .line 8
    iput-object p3, p0, Lyq7;->Z:Lky2;

    .line 9
    .line 10
    iput-object p4, p0, Lyq7;->f0:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lyq7;->g0:Lrn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lxq7;

    .line 2
    .line 3
    instance-of v0, p1, Ltq7;

    .line 4
    .line 5
    iget-object v1, p0, Lyq7;->X:Ldn2;

    .line 6
    .line 7
    sget-object v2, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ltq7;

    .line 12
    .line 13
    iget-object p2, p1, Ltq7;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p1, Ltq7;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, p1, Ltq7;->c:Ljava/lang/Boolean;

    .line 18
    .line 19
    iget-object p1, p1, Ltq7;->d:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget-object p0, p0, Lyq7;->Y:Ltn2;

    .line 22
    .line 23
    invoke-interface {p0, p2, v0, v3, p1}, Ltn2;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_0
    instance-of v0, p1, Luq7;

    .line 31
    .line 32
    sget-object v3, Lc71;->X:Lc71;

    .line 33
    .line 34
    iget-object v4, p0, Lyq7;->f0:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v5, p0, Lyq7;->Z:Lky2;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p0, Lby2;

    .line 41
    .line 42
    sget p1, Ly46;->toast_failure:I

    .line 43
    .line 44
    invoke-virtual {v4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lmy2;->Y:Lmy2;

    .line 52
    .line 53
    invoke-direct {p0, p1, v0}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p0, p2}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v3, :cond_2

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    instance-of v0, p1, Lvq7;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    new-instance p0, Lby2;

    .line 68
    .line 69
    sget p1, Ly46;->toast_success:I

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v0, Lmy2;->X:Lmy2;

    .line 79
    .line 80
    invoke-direct {p0, p1, v0}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, p0, p2}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v3, :cond_2

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    return-object v2

    .line 91
    :cond_3
    instance-of p2, p1, Lwq7;

    .line 92
    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    check-cast p1, Lwq7;

    .line 96
    .line 97
    iget-object p2, p1, Lwq7;->a:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 100
    .line 101
    invoke-direct {v0, p2}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-boolean p1, p1, Lwq7;->b:Z

    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p0, p0, Lyq7;->g0:Lrn2;

    .line 111
    .line 112
    invoke-interface {p0, v0, p1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    return-object p0
.end method
