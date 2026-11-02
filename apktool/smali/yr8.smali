.class public final synthetic Lyr8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lg09;

.field public final synthetic Z:Z

.field public final synthetic f0:Lg09;


# direct methods
.method public synthetic constructor <init>(Lg09;ZLg09;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lyr8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lyr8;->Y:Lg09;

    .line 4
    .line 5
    iput-boolean p2, p0, Lyr8;->Z:Z

    .line 6
    .line 7
    iput-object p3, p0, Lyr8;->f0:Lg09;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lyr8;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lyr8;->f0:Lg09;

    .line 6
    .line 7
    iget-boolean v3, p0, Lyr8;->Z:Z

    .line 8
    .line 9
    iget-object p0, p0, Lyr8;->Y:Lg09;

    .line 10
    .line 11
    check-cast p1, Lwr8;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lb58;

    .line 20
    .line 21
    const/16 v4, 0x14

    .line 22
    .line 23
    invoke-direct {v0, v4}, Lb58;-><init>(B)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    new-array v4, v4, [Lgn2;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aput-object v0, v4, v5

    .line 31
    .line 32
    new-instance v0, Lyr8;

    .line 33
    .line 34
    invoke-direct {v0, p0, v3, v2, v5}, Lyr8;-><init>(Lg09;ZLg09;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v4, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lwr8;->p(Lwr8;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lzs1;

    .line 48
    .line 49
    const/4 v4, 0x6

    .line 50
    invoke-direct {v0, v3, v2, v4}, Lzs1;-><init>(ZLjava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p0, v0}, Lzr8;->a(Lwr8;Lg09;Lgn2;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
