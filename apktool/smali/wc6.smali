.class public final synthetic Lwc6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/io/Serializable;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lwc6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lwc6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lwc6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lwc6;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lwc6;->g0:Ljava/io/Serializable;

    .line 10
    .line 11
    iput-object p5, p0, Lwc6;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lwc6;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lwc6;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lwc6;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lwc6;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lwc6;->g0:Ljava/io/Serializable;

    .line 8
    .line 9
    iget-object v4, p0, Lwc6;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lwc6;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Lwc6;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v6, p0

    .line 19
    check-cast v6, Lmx7;

    .line 20
    .line 21
    move-object v7, v5

    .line 22
    check-cast v7, Llx7;

    .line 23
    .line 24
    move-object v8, v4

    .line 25
    check-cast v8, Ljava/util/ArrayList;

    .line 26
    .line 27
    move-object v9, v3

    .line 28
    check-cast v9, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    move-object v10, v2

    .line 31
    check-cast v10, Ljava/util/List;

    .line 32
    .line 33
    move-object v11, v1

    .line 34
    check-cast v11, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual/range {v6 .. v11}, Lmx7;->a(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p0, Lhv6;

    .line 46
    .line 47
    check-cast v5, Lbw6;

    .line 48
    .line 49
    check-cast v4, Lkv6;

    .line 50
    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    check-cast v1, [Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, p0, Lhv6;->Y:Lkv6;

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    if-eq v0, v4, :cond_0

    .line 59
    .line 60
    iput-object v4, p0, Lhv6;->Y:Lkv6;

    .line 61
    .line 62
    move v0, v6

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v0, 0x0

    .line 65
    :goto_0
    iget-object v4, p0, Lhv6;->Z:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_1

    .line 72
    .line 73
    iput-object v3, p0, Lhv6;->Z:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move v6, v0

    .line 77
    :goto_1
    iput-object v5, p0, Lhv6;->X:Lbw6;

    .line 78
    .line 79
    iput-object v2, p0, Lhv6;->f0:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v1, p0, Lhv6;->g0:[Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v0, p0, Lhv6;->h0:Lf63;

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0}, Lf63;->D()V

    .line 90
    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, Lhv6;->h0:Lf63;

    .line 94
    .line 95
    invoke-virtual {p0}, Lhv6;->d()V

    .line 96
    .line 97
    .line 98
    :cond_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
