.class public final Lu44;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lv44;


# direct methods
.method public synthetic constructor <init>(Lv44;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lu44;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lu44;->Y:Lv44;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lu44;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lu44;->Y:Lv44;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lv44;->k0:Ldb6;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    sget-object v1, Ld02;->X:Ld02;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lv44;->l0:Lz47;

    .line 28
    .line 29
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object p0, p0, Luf5;->i0:Lfk2;

    .line 32
    .line 33
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 34
    .line 35
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
