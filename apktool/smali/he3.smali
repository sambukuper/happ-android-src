.class public final synthetic Lhe3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lie3;


# direct methods
.method public synthetic constructor <init>(Lie3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhe3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhe3;->Y:Lie3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lhe3;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lhe3;->Y:Lie3;

    .line 4
    .line 5
    check-cast p1, Lye8;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p1, Lie3;

    .line 14
    .line 15
    iget-object p1, p1, Lie3;->r0:Lv09;

    .line 16
    .line 17
    iput-object p1, p0, Lie3;->q0:Lv09;

    .line 18
    .line 19
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p1, Lie3;

    .line 26
    .line 27
    iget-object p0, p0, Lie3;->r0:Lv09;

    .line 28
    .line 29
    iget-object v0, p1, Lie3;->q0:Lv09;

    .line 30
    .line 31
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iput-object p0, p1, Lie3;->q0:Lv09;

    .line 38
    .line 39
    invoke-virtual {p1}, Lie3;->Z0()V

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object p0, Lxe8;->Y:Lxe8;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
