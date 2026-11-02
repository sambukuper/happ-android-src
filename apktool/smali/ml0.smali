.class public final synthetic Lml0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld41;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lml0;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lml0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lml0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-byte v0, p0, Lml0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lml0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Lml0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcx1;

    .line 12
    .line 13
    check-cast v2, Lby7;

    .line 14
    .line 15
    check-cast p1, Lkz;

    .line 16
    .line 17
    invoke-virtual {v2}, Lby7;->close()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcx1;->h:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/view/Surface;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lcx1;->a:Lax1;

    .line 31
    .line 32
    iget-object v0, p0, Lib5;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lfp2;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lib5;->c:Ljava/lang/Thread;

    .line 38
    .line 39
    invoke-static {v0}, Lfp2;->c(Ljava/lang/Thread;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v1}, Lib5;->j(Landroid/view/Surface;Z)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :pswitch_0
    check-cast p0, Ljg1;

    .line 47
    .line 48
    check-cast v2, Lby7;

    .line 49
    .line 50
    check-cast p1, Lkz;

    .line 51
    .line 52
    invoke-virtual {v2}, Lby7;->close()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ljg1;->h:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroid/view/Surface;

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object p0, p0, Ljg1;->a:Lib5;

    .line 66
    .line 67
    iget-object v0, p0, Lib5;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lfp2;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lib5;->c:Ljava/lang/Thread;

    .line 73
    .line 74
    invoke-static {v0}, Lfp2;->c(Ljava/lang/Thread;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v1}, Lib5;->j(Landroid/view/Surface;Z)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :pswitch_1
    check-cast p0, Landroid/view/Surface;

    .line 82
    .line 83
    check-cast v2, Landroid/graphics/SurfaceTexture;

    .line 84
    .line 85
    check-cast p1, Llz;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
