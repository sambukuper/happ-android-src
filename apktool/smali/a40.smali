.class public final synthetic La40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lb88;

.field public final synthetic Z:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lb88;Lgn2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La40;->X:B

    .line 2
    .line 3
    iput-object p1, p0, La40;->Y:Lb88;

    .line 4
    .line 5
    iput-object p2, p0, La40;->Z:Lgn2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La40;->X:B

    .line 2
    .line 3
    iget-object v1, p0, La40;->Z:Lgn2;

    .line 4
    .line 5
    iget-object p0, p0, La40;->Y:Lb88;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Leq1;

    .line 11
    .line 12
    iget-object p1, p0, Lb88;->c:Lvd7;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance p1, Lp00;

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    invoke-direct {p1, p0, v1, v0}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lx78;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, Lb88;->a:Lrh5;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v1, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
