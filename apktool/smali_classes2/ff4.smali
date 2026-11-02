.class public final synthetic Lff4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lgn2;

.field public final synthetic Z:Llf4;


# direct methods
.method public synthetic constructor <init>(Lgn2;Llf4;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lff4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lff4;->Y:Lgn2;

    .line 4
    .line 5
    iput-object p2, p0, Lff4;->Z:Llf4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lff4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lff4;->Z:Llf4;

    .line 6
    .line 7
    iget-object p0, p0, Lff4;->Y:Lgn2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v2, Llf4;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Lyf4;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Lyf4;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v0, Ldg4;

    .line 30
    .line 31
    invoke-direct {v0, v2}, Ldg4;-><init>(Llf4;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

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
