.class public final synthetic Lxw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lo87;

.field public final synthetic Z:Ljava/lang/String;

.field public final synthetic f0:Ljava/lang/String;

.field public final synthetic g0:Ljava/lang/String;

.field public final synthetic h0:Ldn2;

.field public final synthetic i0:Lb71;


# direct methods
.method public synthetic constructor <init>(ZLo87;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldn2;Lb71;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxw4;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lxw4;->Y:Lo87;

    .line 7
    .line 8
    iput-object p3, p0, Lxw4;->Z:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lxw4;->f0:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lxw4;->g0:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lxw4;->h0:Ldn2;

    .line 15
    .line 16
    iput-object p7, p0, Lxw4;->i0:Lb71;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lxw4;->Y:Lo87;

    .line 2
    .line 3
    iget-object v1, v0, Lo87;->d:Lt5;

    .line 4
    .line 5
    check-cast p1, Lf17;

    .line 6
    .line 7
    iget-boolean v2, p0, Lxw4;->X:Z

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    new-instance v2, Lmv2;

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    iget-object v4, p0, Lxw4;->h0:Ldn2;

    .line 15
    .line 16
    invoke-direct {v2, v4, v3}, Lmv2;-><init>(Ldn2;B)V

    .line 17
    .line 18
    .line 19
    sget-object v3, Ld17;->a:[Lnw3;

    .line 20
    .line 21
    sget-object v3, Ls07;->v:Le17;

    .line 22
    .line 23
    new-instance v4, Lq3;

    .line 24
    .line 25
    iget-object v5, p0, Lxw4;->Z:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {v4, v5, v2}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v3, v4}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Lt5;->i0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lrh5;

    .line 36
    .line 37
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lp87;

    .line 42
    .line 43
    iget-object v3, p0, Lxw4;->i0:Lb71;

    .line 44
    .line 45
    sget-object v4, Lp87;->Z:Lp87;

    .line 46
    .line 47
    if-ne v2, v4, :cond_0

    .line 48
    .line 49
    new-instance v1, Lg00;

    .line 50
    .line 51
    const/16 v2, 0xd

    .line 52
    .line 53
    invoke-direct {v1, v0, v3, v0, v2}, Lg00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Ls07;->t:Le17;

    .line 57
    .line 58
    new-instance v2, Lq3;

    .line 59
    .line 60
    iget-object p0, p0, Lxw4;->f0:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v2, p0, v1}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v1}, Lt5;->d()Llp4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, Llp4;->a:Ljava/util/Map;

    .line 74
    .line 75
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    new-instance v1, La23;

    .line 82
    .line 83
    const/16 v2, 0x8

    .line 84
    .line 85
    invoke-direct {v1, v0, v3, v2}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Ls07;->u:Le17;

    .line 89
    .line 90
    new-instance v2, Lq3;

    .line 91
    .line 92
    iget-object p0, p0, Lxw4;->g0:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {v2, p0, v1}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v0, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 101
    .line 102
    return-object p0
.end method
