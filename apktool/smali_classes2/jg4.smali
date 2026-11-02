.class public final synthetic Ljg4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Llg4;

.field public final synthetic Z:Loh2;

.field public final synthetic f0:Loh2;

.field public final synthetic g0:Z

.field public final synthetic h0:Lgn2;

.field public final synthetic i0:Ly05;


# direct methods
.method public synthetic constructor <init>(Llg4;Loh2;Loh2;ZLgn2;Ly05;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, Ljg4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljg4;->Y:Llg4;

    .line 4
    .line 5
    iput-object p2, p0, Ljg4;->Z:Loh2;

    .line 6
    .line 7
    iput-object p3, p0, Ljg4;->f0:Loh2;

    .line 8
    .line 9
    iput-boolean p4, p0, Ljg4;->g0:Z

    .line 10
    .line 11
    iput-object p5, p0, Ljg4;->h0:Lgn2;

    .line 12
    .line 13
    iput-object p6, p0, Ljg4;->i0:Ly05;

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
    .locals 7

    .line 1
    iget-byte v0, p0, Ljg4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Ljg4;->i0:Ly05;

    .line 6
    .line 7
    iget-object v3, p0, Ljg4;->h0:Lgn2;

    .line 8
    .line 9
    iget-boolean v4, p0, Ljg4;->g0:Z

    .line 10
    .line 11
    iget-object v5, p0, Ljg4;->f0:Loh2;

    .line 12
    .line 13
    iget-object v6, p0, Ljg4;->Z:Loh2;

    .line 14
    .line 15
    iget-object p0, p0, Ljg4;->Y:Llg4;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget v0, p0, Llg4;->c:I

    .line 21
    .line 22
    iget p0, p0, Llg4;->f:I

    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x2

    .line 25
    .line 26
    if-ge v0, p0, :cond_0

    .line 27
    .line 28
    move-object v5, v6

    .line 29
    :cond_0
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-interface {v2, v5}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lbh4;->a:Lbh4;

    .line 35
    .line 36
    invoke-interface {v3, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_0
    iget p0, p0, Llg4;->c:I

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    if-le p0, v0, :cond_2

    .line 44
    .line 45
    move-object v5, v6

    .line 46
    :cond_2
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v2, v5}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    sget-object p0, Lch4;->a:Lch4;

    .line 52
    .line 53
    invoke-interface {v3, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

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
