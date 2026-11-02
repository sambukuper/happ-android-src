.class public final Lga9;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lza9;
.implements Lab5;
.implements Lna5;
.implements Lba5;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/util/concurrent/Executor;

.field public final Z:Lr51;

.field public final f0:Lfb9;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lr51;Lfb9;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lga9;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lga9;->Y:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iput-object p2, p0, Lga9;->Z:Lr51;

    .line 6
    .line 7
    iput-object p3, p0, Lga9;->f0:Lfb9;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lfb9;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lga9;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lga9;->Y:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lzo2;

    .line 10
    .line 11
    const/16 v3, 0x13

    .line 12
    .line 13
    invoke-direct {v0, v3, p0, p1, v2}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance v0, Lzo2;

    .line 21
    .line 22
    const/16 v3, 0x12

    .line 23
    .line 24
    invoke-direct {v0, v3, p0, p1, v2}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lga9;->f0:Lfb9;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfb9;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lga9;->f0:Lfb9;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfb9;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lga9;->f0:Lfb9;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
