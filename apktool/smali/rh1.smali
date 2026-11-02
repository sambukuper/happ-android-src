.class public final synthetic Lrh1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Runnable;

.field public final synthetic Z:Lwl6;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lwl6;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lrh1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrh1;->Y:Ljava/lang/Runnable;

    .line 4
    .line 5
    iput-object p2, p0, Lrh1;->Z:Lwl6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lrh1;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lrh1;->Z:Lwl6;

    .line 4
    .line 5
    iget-object p0, p0, Lrh1;->Y:Ljava/lang/Runnable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lwl6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxh1;

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-virtual {v0, p0}, Lu2;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    invoke-virtual {v0, p0}, Lu2;->k(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :pswitch_0
    :try_start_1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catch_1
    move-exception p0

    .line 32
    iget-object v0, v1, Lwl6;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lxh1;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Lu2;->k(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    :goto_1
    return-void

    .line 40
    :pswitch_1
    :try_start_2
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_2
    move-exception p0

    .line 45
    iget-object v0, v1, Lwl6;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lxh1;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lu2;->k(Ljava/lang/Throwable;)Z

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
