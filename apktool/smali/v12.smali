.class public final Lv12;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Lg22;

.field public final synthetic f0:Lh62;


# direct methods
.method public synthetic constructor <init>(Lg22;Lh62;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lv12;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lv12;->Z:Lg22;

    .line 4
    .line 5
    iput-object p2, p0, Lv12;->f0:Lh62;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lv12;->Y:B

    .line 2
    .line 3
    iget-object v1, p0, Lv12;->f0:Lh62;

    .line 4
    .line 5
    sget-object v2, Lr12;->Z:Lr12;

    .line 6
    .line 7
    iget-object p0, p0, Lv12;->Z:Lg22;

    .line 8
    .line 9
    sget-object v3, Lr12;->Y:Lr12;

    .line 10
    .line 11
    sget-object v4, Lr12;->X:Lr12;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lwd8;

    .line 17
    .line 18
    invoke-interface {p1, v4, v3}, Lwd8;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lg22;->a:Lbe8;

    .line 25
    .line 26
    iget-object p0, p0, Lbe8;->d:Lqw6;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lqw6;->c:Lta2;

    .line 31
    .line 32
    if-nez p0, :cond_4

    .line 33
    .line 34
    :cond_0
    sget-object p0, Lb22;->b:Lwf7;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {p1, v3, v2}, Lwd8;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    iget-object p0, v1, Lh62;->a:Lbe8;

    .line 44
    .line 45
    iget-object p0, p0, Lbe8;->d:Lqw6;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Lqw6;->c:Lta2;

    .line 50
    .line 51
    if-nez p0, :cond_4

    .line 52
    .line 53
    :cond_2
    sget-object p0, Lb22;->b:Lwf7;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object p0, Lb22;->b:Lwf7;

    .line 57
    .line 58
    :cond_4
    :goto_0
    return-object p0

    .line 59
    :pswitch_0
    check-cast p1, Lwd8;

    .line 60
    .line 61
    invoke-interface {p1, v4, v3}, Lwd8;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    iget-object p0, p0, Lg22;->a:Lbe8;

    .line 68
    .line 69
    iget-object p0, p0, Lbe8;->a:Lu72;

    .line 70
    .line 71
    if-eqz p0, :cond_5

    .line 72
    .line 73
    iget-object p0, p0, Lu72;->b:Lta2;

    .line 74
    .line 75
    if-nez p0, :cond_9

    .line 76
    .line 77
    :cond_5
    sget-object p0, Lb22;->b:Lwf7;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_6
    invoke-interface {p1, v3, v2}, Lwd8;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_8

    .line 85
    .line 86
    iget-object p0, v1, Lh62;->a:Lbe8;

    .line 87
    .line 88
    iget-object p0, p0, Lbe8;->a:Lu72;

    .line 89
    .line 90
    if-eqz p0, :cond_7

    .line 91
    .line 92
    iget-object p0, p0, Lu72;->b:Lta2;

    .line 93
    .line 94
    if-nez p0, :cond_9

    .line 95
    .line 96
    :cond_7
    sget-object p0, Lb22;->b:Lwf7;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_8
    sget-object p0, Lb22;->b:Lwf7;

    .line 100
    .line 101
    :cond_9
    :goto_1
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
