.class public final synthetic Lj9;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lha;

.field public final synthetic Z:Lba6;


# direct methods
.method public synthetic constructor <init>(Lha;Lba6;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lj9;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lj9;->Y:Lha;

    .line 4
    .line 5
    iput-object p2, p0, Lj9;->Z:Lba6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lj9;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lj9;->Z:Lba6;

    .line 6
    .line 7
    iget-object p0, p0, Lj9;->Y:Lha;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    check-cast p2, Ljava/lang/Float;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lha;->a:Lt5;

    .line 25
    .line 26
    iget-object v0, p0, Lt5;->k0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lnh5;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lnh5;->m(F)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lt5;->l0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lnh5;

    .line 36
    .line 37
    invoke-virtual {p0, p2}, Lnh5;->m(F)V

    .line 38
    .line 39
    .line 40
    iput p1, v2, Lba6;->X:F

    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_0
    iget-object p0, p0, Lha;->a:Lt5;

    .line 44
    .line 45
    iget-object v0, p0, Lt5;->k0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lnh5;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lnh5;->m(F)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lt5;->l0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lnh5;

    .line 55
    .line 56
    invoke-virtual {p0, p2}, Lnh5;->m(F)V

    .line 57
    .line 58
    .line 59
    iput p1, v2, Lba6;->X:F

    .line 60
    .line 61
    return-object v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
