.class public final synthetic Lqh4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lsf4;

.field public final synthetic Y:I

.field public final synthetic Z:Lcm5;

.field public final synthetic f0:Loh2;

.field public final synthetic g0:Loh2;

.field public final synthetic h0:Loh2;


# direct methods
.method public synthetic constructor <init>(Lsf4;ILcm5;Loh2;Loh2;Loh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqh4;->X:Lsf4;

    .line 5
    .line 6
    iput p2, p0, Lqh4;->Y:I

    .line 7
    .line 8
    iput-object p3, p0, Lqh4;->Z:Lcm5;

    .line 9
    .line 10
    iput-object p4, p0, Lqh4;->f0:Loh2;

    .line 11
    .line 12
    iput-object p5, p0, Lqh4;->g0:Loh2;

    .line 13
    .line 14
    iput-object p6, p0, Lqh4;->h0:Loh2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lqh4;->X:Lsf4;

    .line 2
    .line 3
    iget-object v0, v0, Lsf4;->f:Lj2;

    .line 4
    .line 5
    iget v1, p0, Lqh4;->Y:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    invoke-static {v2, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Llf4;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Llf4;->b:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    invoke-static {v1, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Llf4;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v2, v0, Llf4;->b:Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v2, v3

    .line 36
    :cond_2
    :goto_0
    if-eqz v2, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, Lqh4;->Z:Lcm5;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Loh2;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-static {v0}, Loh2;->a(Loh2;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v1, v3

    .line 60
    :goto_1
    if-eqz v1, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    iget-object v0, p0, Lqh4;->f0:Loh2;

    .line 64
    .line 65
    invoke-static {v0}, Loh2;->a(Loh2;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    move-object v1, v3

    .line 77
    :goto_2
    if-eqz v1, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    iget-object v0, p0, Lqh4;->g0:Loh2;

    .line 81
    .line 82
    invoke-static {v0}, Loh2;->a(Loh2;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    move-object v3, v1

    .line 93
    :cond_7
    if-eqz v3, :cond_8

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_8
    iget-object p0, p0, Lqh4;->h0:Loh2;

    .line 97
    .line 98
    invoke-static {p0}, Loh2;->a(Loh2;)Z

    .line 99
    .line 100
    .line 101
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 102
    .line 103
    return-object p0
.end method
