.class public final synthetic Lmr0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lf17;


# direct methods
.method public synthetic constructor <init>(Lf17;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lmr0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lmr0;->Y:Lf17;

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
    .locals 4

    .line 1
    iget-byte v0, p0, Lmr0;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lmr0;->Y:Lf17;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lga2;

    .line 10
    .line 11
    check-cast p1, Lyd;

    .line 12
    .line 13
    invoke-virtual {p1}, Lyd;->a()Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    sget-object p1, Lib8;->X:Lib8;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Lib8;->Y:Lib8;

    .line 29
    .line 30
    :goto_0
    sget-object v0, Ld17;->a:[Lnw3;

    .line 31
    .line 32
    sget-object v0, Lc17;->L:Le17;

    .line 33
    .line 34
    sget-object v2, Ld17;->a:[Lnw3;

    .line 35
    .line 36
    const/16 v3, 0x1a

    .line 37
    .line 38
    aget-object v2, v2, v3

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v0, p1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v1, 0x0

    .line 48
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_0
    check-cast p1, Lye8;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast p1, Ldi5;

    .line 59
    .line 60
    iput-boolean v1, p1, Ldi5;->r0:Z

    .line 61
    .line 62
    iget-object v0, p1, Ldi5;->q0:Lsn;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Lsn;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
