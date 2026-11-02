.class public final synthetic Lhv7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ldw7;


# direct methods
.method public synthetic constructor <init>(Ldw7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhv7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhv7;->Y:Ldw7;

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
    .locals 14

    .line 1
    iget-byte v0, p0, Lhv7;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lhv7;->Y:Ldw7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lp35;

    .line 9
    .line 10
    new-instance v1, Liv7;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v1, p0, v2}, Liv7;-><init>(Ldw7;B)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lp35;-><init>(Liv7;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v3, Lf47;

    .line 21
    .line 22
    iget-object v4, p0, Ldw7;->d:Luv7;

    .line 23
    .line 24
    new-instance v5, Liv7;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {v5, p0, v0}, Liv7;-><init>(Ldw7;B)V

    .line 28
    .line 29
    .line 30
    new-instance v6, Liv7;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {v6, p0, v0}, Liv7;-><init>(Ldw7;B)V

    .line 34
    .line 35
    .line 36
    iget-object v7, p0, Ldw7;->l:Lvj4;

    .line 37
    .line 38
    iget-object v8, p0, Ldw7;->f:Lrn2;

    .line 39
    .line 40
    iget-object v9, p0, Ldw7;->h:Lsn2;

    .line 41
    .line 42
    iget-object v10, p0, Ldw7;->i:Ldn2;

    .line 43
    .line 44
    invoke-direct/range {v3 .. v10}, Lf47;-><init>(Luv7;Liv7;Liv7;Lvj4;Lrn2;Lsn2;Ldn2;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :pswitch_1
    new-instance v4, Lkq7;

    .line 49
    .line 50
    iget-object v5, p0, Ldw7;->d:Luv7;

    .line 51
    .line 52
    new-instance v6, Liv7;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {v6, p0, v0}, Liv7;-><init>(Ldw7;B)V

    .line 56
    .line 57
    .line 58
    iget-object v7, p0, Ldw7;->m:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 59
    .line 60
    iget-object v8, p0, Ldw7;->l:Lvj4;

    .line 61
    .line 62
    iget-object v9, p0, Ldw7;->e:Lmh7;

    .line 63
    .line 64
    iget-object v10, p0, Ldw7;->g:Lrn2;

    .line 65
    .line 66
    iget-object v11, p0, Ldw7;->h:Lsn2;

    .line 67
    .line 68
    iget-object v12, p0, Ldw7;->j:Lgn2;

    .line 69
    .line 70
    iget-object v13, p0, Ldw7;->k:Lrn2;

    .line 71
    .line 72
    invoke-direct/range {v4 .. v13}, Lkq7;-><init>(Luv7;Liv7;Lsu/happ/proxyutility/feature/main/MainActivity;Lvj4;Lmh7;Lrn2;Lsn2;Lgn2;Lrn2;)V

    .line 73
    .line 74
    .line 75
    return-object v4

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
