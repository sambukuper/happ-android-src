.class public final synthetic Lig4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Loh2;

.field public final synthetic Z:Z

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:Ly05;


# direct methods
.method public synthetic constructor <init>(Loh2;ZLgn2;Ly05;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lig4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lig4;->Y:Loh2;

    .line 4
    .line 5
    iput-boolean p2, p0, Lig4;->Z:Z

    .line 6
    .line 7
    iput-object p3, p0, Lig4;->f0:Lgn2;

    .line 8
    .line 9
    iput-object p4, p0, Lig4;->g0:Ly05;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lig4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lig4;->g0:Ly05;

    .line 6
    .line 7
    iget-object v3, p0, Lig4;->f0:Lgn2;

    .line 8
    .line 9
    iget-boolean v4, p0, Lig4;->Z:Z

    .line 10
    .line 11
    iget-object p0, p0, Lig4;->Y:Loh2;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-interface {v2, p0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p0, Lzg4;->a:Lzg4;

    .line 22
    .line 23
    invoke-interface {v3, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_0
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v2, p0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    sget-object p0, Lyg4;->a:Lyg4;

    .line 33
    .line 34
    invoke-interface {v3, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
