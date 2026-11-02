.class public final Lyi;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lyi;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lyi;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lyi;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-byte v0, p0, Lyi;->a:B

    .line 2
    .line 3
    iget-object v1, p0, Lyi;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lyi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lyi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljv6;

    .line 13
    .line 14
    iget-object v0, p0, Ljv6;->Y:Ls05;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ls05;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v1, Lnv6;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Ljv6;->X:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {v1}, Lnv6;->d()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    check-cast p0, Ld94;

    .line 45
    .line 46
    invoke-interface {p0}, Ld94;->h()Lg94;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast v2, Ly84;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lg94;->f(Lc94;)V

    .line 53
    .line 54
    .line 55
    check-cast v1, Lea6;

    .line 56
    .line 57
    iget-object p0, v1, Lea6;->X:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lo00;

    .line 60
    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lo00;->a()V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :pswitch_1
    check-cast p0, Lvd7;

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    check-cast v1, Llj;

    .line 73
    .line 74
    iget-object p0, v1, Llj;->c:Ls05;

    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ls05;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
