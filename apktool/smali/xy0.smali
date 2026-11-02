.class public final Lxy0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lny0;
.implements Lv06;


# static fields
.field public static final k0:Lvy0;

.field public static final l0:[Lf50;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public h0:Ljava/lang/Object;

.field public i0:Ljava/lang/Object;

.field public j0:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvy0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvy0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxy0;->k0:Lvy0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Lf50;

    .line 11
    .line 12
    sput-object v0, Lxy0;->l0:[Lf50;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 738
    const/4 v0, 0x2

    iput-byte v0, p0, Lxy0;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Lra;)V
    .locals 7

    const/4 v0, 0x0

    iput-byte v0, p0, Lxy0;->X:B

    sget-object v1, Lnl8;->X:Lnl8;

    .line 687
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 688
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 689
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 690
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 691
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 692
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v1, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 693
    new-instance v1, Lb42;

    invoke-direct {v1}, Lb42;-><init>()V

    iput-object v1, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 694
    iput-object p3, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 695
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 696
    const-class v2, Lb42;

    const-class v3, Lbq7;

    const-class v4, Ly16;

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcy0;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcy0;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    const-class v1, Lxy0;

    new-array v2, v0, [Ljava/lang/Class;

    invoke-static {p0, v1, v2}, Lcy0;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcy0;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcy0;

    if-eqz v1, :cond_0

    .line 699
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 700
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 701
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 702
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 703
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 704
    monitor-enter p0

    .line 705
    :try_start_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 706
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 707
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw06;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 708
    :try_start_1
    invoke-interface {v1}, Lw06;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/components/ComponentRegistrar;

    if-eqz v1, :cond_3

    .line 709
    iget-object v2, p0, Lxy0;->j0:Ljava/lang/Object;

    check-cast v2, Lra;

    invoke-virtual {v2, v1}, Lra;->m(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 710
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Lsh3; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    .line 711
    :catch_0
    :try_start_2
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    .line 712
    :cond_4
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 713
    :cond_5
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 714
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcy0;

    .line 715
    iget-object v1, v1, Lcy0;->b:Ljava/util/Set;

    .line 716
    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    array-length v2, v1

    move v3, v0

    :goto_4
    if-ge v3, v2, :cond_5

    aget-object v4, v1, v3

    .line 717
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "kotlinx.coroutines.CoroutineDispatcher"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 718
    iget-object v5, p0, Lxy0;->g0:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 719
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 720
    :cond_6
    iget-object v5, p0, Lxy0;->g0:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 721
    :cond_8
    iget-object p2, p0, Lxy0;->Y:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 722
    invoke-static {p3}, Los4;->n(Ljava/util/ArrayList;)V

    goto :goto_5

    .line 723
    :cond_9
    new-instance p2, Ljava/util/ArrayList;

    iget-object v1, p0, Lxy0;->Y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 724
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 725
    invoke-static {p2}, Los4;->n(Ljava/util/ArrayList;)V

    .line 726
    :goto_5
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcy0;

    .line 727
    new-instance v2, Lh44;

    new-instance v3, Lwy0;

    invoke-direct {v3, p0, v1, v0}, Lwy0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-direct {v2, v3}, Lh44;-><init>(Lw06;)V

    .line 728
    iget-object v3, p0, Lxy0;->Y:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 729
    :cond_a
    invoke-virtual {p0, p3}, Lxy0;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 730
    invoke-virtual {p0}, Lxy0;->l()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 731
    invoke-virtual {p0}, Lxy0;->g()V

    .line 732
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 733
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    .line 734
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_7

    .line 735
    :cond_b
    iget-object p1, p0, Lxy0;->i0:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_c

    .line 736
    iget-object p2, p0, Lxy0;->Y:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p2, p1}, Lxy0;->d(Ljava/util/HashMap;Z)V

    :cond_c
    return-void

    .line 737
    :goto_8
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, Lxy0;->X:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v1, Liz;->h:Landroid/util/Range;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object p2, Lm02;->X:Lm02;

    .line 20
    .line 21
    iput-object p2, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p2, Ld02;->X:Ld02;

    .line 24
    .line 25
    iput-object p2, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p1}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance p2, Lbn0;

    .line 38
    .line 39
    const/4 v2, 0x6

    .line 40
    invoke-direct {p2, v2}, Lbn0;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    const/4 v1, 0x0

    .line 59
    if-eqz p2, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    check-cast p2, Lhq8;

    .line 77
    .line 78
    iget-object p2, p2, Lhq8;->f:Ler8;

    .line 79
    .line 80
    sget-object v2, Ler8;->R:Lzx;

    .line 81
    .line 82
    invoke-interface {p2, v2}, Lb76;->h(Lzx;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-nez p2, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const-string p0, "Can\'t set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig."

    .line 90
    .line 91
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :cond_2
    :goto_1
    iget-object p1, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Ljava/util/List;

    .line 98
    .line 99
    iget-object p2, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Ljava/util/Set;

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    goto/16 :goto_d

    .line 116
    .line 117
    :cond_3
    check-cast p2, Ljava/lang/Iterable;

    .line 118
    .line 119
    new-instance v2, Ljava/util/ArrayList;

    .line 120
    .line 121
    const/16 v3, 0xa

    .line 122
    .line 123
    invoke-static {p2, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_4

    .line 139
    .line 140
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lru2;

    .line 145
    .line 146
    invoke-virtual {v4}, Lru2;->a()Ls82;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    invoke-static {v2}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v2}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    const/4 v4, 0x1

    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ls82;

    .line 178
    .line 179
    new-instance v5, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    :cond_5
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_6

    .line 193
    .line 194
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    move-object v8, v7

    .line 199
    check-cast v8, Lru2;

    .line 200
    .line 201
    invoke-virtual {v8}, Lru2;->a()Ls82;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    if-ne v8, v3, :cond_5

    .line 206
    .line 207
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-gt v3, v4, :cond_7

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_7
    const-string p0, "requiredFeatures has conflicting feature values: "

    .line 219
    .line 220
    invoke-static {v5, p0}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v1

    .line 224
    :cond_8
    invoke-static {p1}, Lwv0;->n0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-ne v2, v3, :cond_2a

    .line 237
    .line 238
    invoke-static {p2, p1}, Lwv0;->v0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-eqz p2, :cond_29

    .line 247
    .line 248
    iget-object p0, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, Ljava/util/List;

    .line 251
    .line 252
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_28

    .line 261
    .line 262
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    check-cast p1, Lhq8;

    .line 267
    .line 268
    sget-object p2, Lqr8;->Y:Ls18;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {p1}, Ls18;->c(Lhq8;)Lqr8;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    sget-object v3, Lqr8;->j0:Lqr8;

    .line 278
    .line 279
    if-eq v2, v3, :cond_27

    .line 280
    .line 281
    instance-of v2, p1, Llt5;

    .line 282
    .line 283
    if-eqz v2, :cond_9

    .line 284
    .line 285
    const-string v2, "Preview"

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_9
    instance-of v2, p1, Lx53;

    .line 289
    .line 290
    if-eqz v2, :cond_a

    .line 291
    .line 292
    const-string v2, "ImageCapture"

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_a
    instance-of v2, p1, Lk53;

    .line 296
    .line 297
    if-eqz v2, :cond_b

    .line 298
    .line 299
    const-string v2, "ImageAnalysis"

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_b
    invoke-static {p1}, Lts7;->f(Lhq8;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_c

    .line 307
    .line 308
    const-string v2, "VideoCapture"

    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_c
    const-string v2, "UseCase"

    .line 312
    .line 313
    :goto_6
    sget-object v3, Ls82;->h0:Ln22;

    .line 314
    .line 315
    invoke-virtual {v3}, Lz1;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    const/4 v6, 0x2

    .line 324
    const/4 v7, 0x3

    .line 325
    if-eqz v5, :cond_15

    .line 326
    .line 327
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    move-object v8, v5

    .line 332
    check-cast v8, Ls82;

    .line 333
    .line 334
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-eqz v8, :cond_14

    .line 342
    .line 343
    if-eq v8, v4, :cond_13

    .line 344
    .line 345
    if-eq v8, v6, :cond_10

    .line 346
    .line 347
    if-eq v8, v7, :cond_f

    .line 348
    .line 349
    if-ne v8, v0, :cond_e

    .line 350
    .line 351
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 352
    .line 353
    sget-object v9, Ler8;->c0:Lzx;

    .line 354
    .line 355
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-interface {v8, v9, v10}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 362
    .line 363
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    goto :goto_8

    .line 368
    :cond_e
    invoke-static {}, Lb61;->c()V

    .line 369
    .line 370
    .line 371
    throw v1

    .line 372
    :cond_f
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 373
    .line 374
    sget-object v9, Ly53;->g0:Lzx;

    .line 375
    .line 376
    invoke-interface {v8, v9}, Lb76;->h(Lzx;)Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    goto :goto_8

    .line 381
    :cond_10
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 382
    .line 383
    sget-object v9, Ler8;->a0:Lzx;

    .line 384
    .line 385
    invoke-interface {v8, v9}, Lb76;->h(Lzx;)Z

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    if-nez v8, :cond_12

    .line 390
    .line 391
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 392
    .line 393
    sget-object v9, Ler8;->b0:Lzx;

    .line 394
    .line 395
    invoke-interface {v8, v9}, Lb76;->h(Lzx;)Z

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    if-eqz v8, :cond_11

    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_11
    const/4 v8, 0x0

    .line 403
    goto :goto_8

    .line 404
    :cond_12
    :goto_7
    move v8, v4

    .line 405
    goto :goto_8

    .line 406
    :cond_13
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 407
    .line 408
    sget-object v9, Ler8;->R:Lzx;

    .line 409
    .line 410
    invoke-interface {v8, v9}, Lb76;->h(Lzx;)Z

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    goto :goto_8

    .line 415
    :cond_14
    iget-object v8, p1, Lhq8;->f:Ler8;

    .line 416
    .line 417
    sget-object v9, Le63;->r:Lzx;

    .line 418
    .line 419
    invoke-interface {v8, v9}, Lb76;->h(Lzx;)Z

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    :goto_8
    if-eqz v8, :cond_d

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_15
    move-object v5, v1

    .line 427
    :goto_9
    check-cast v5, Ls82;

    .line 428
    .line 429
    if-nez v5, :cond_16

    .line 430
    .line 431
    goto/16 :goto_5

    .line 432
    .line 433
    :cond_16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string p2, "A "

    .line 436
    .line 437
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p2

    .line 444
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    const-string p2, " value is set to "

    .line 448
    .line 449
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    const-string p2, " despite using feature groups. Do not use APIs like "

    .line 456
    .line 457
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 461
    .line 462
    .line 463
    move-result p2

    .line 464
    if-eqz p2, :cond_1c

    .line 465
    .line 466
    if-eq p2, v4, :cond_1b

    .line 467
    .line 468
    if-eq p2, v6, :cond_19

    .line 469
    .line 470
    if-eq p2, v7, :cond_18

    .line 471
    .line 472
    if-ne p2, v0, :cond_17

    .line 473
    .line 474
    const-string p1, "Recorder.Builder.setQualitySelector"

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_17
    invoke-static {}, Lb61;->c()V

    .line 478
    .line 479
    .line 480
    throw v1

    .line 481
    :cond_18
    const-string p1, ".Builder.setOutputFormat"

    .line 482
    .line 483
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    goto :goto_a

    .line 488
    :cond_19
    invoke-static {p1}, Lts7;->f(Lhq8;)Z

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    if-eqz p1, :cond_1a

    .line 493
    .line 494
    const-string p1, ".Builder.setVideoStabilizationEnabled"

    .line 495
    .line 496
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    goto :goto_a

    .line 501
    :cond_1a
    const-string p1, ".Builder.setPreviewStabilizationEnabled"

    .line 502
    .line 503
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    goto :goto_a

    .line 508
    :cond_1b
    const-string p1, ".Builder.setTargetFrameRateRange"

    .line 509
    .line 510
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    goto :goto_a

    .line 515
    :cond_1c
    const-string p1, ".Builder.setDynamicRange"

    .line 516
    .line 517
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    :goto_a
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    const-string p1, " while using feature groups. If, for example, "

    .line 525
    .line 526
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    if-eqz p1, :cond_21

    .line 534
    .line 535
    if-eq p1, v4, :cond_20

    .line 536
    .line 537
    if-eq p1, v6, :cond_1f

    .line 538
    .line 539
    if-eq p1, v7, :cond_1e

    .line 540
    .line 541
    if-ne p1, v0, :cond_1d

    .line 542
    .line 543
    const-string p1, "UHD recording quality"

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_1d
    invoke-static {}, Lb61;->c()V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :cond_1e
    const-string p1, "JPEG_R output format"

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_1f
    const-string p1, "stabilization"

    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_20
    const-string p1, "60 FPS"

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_21
    const-string p1, "HDR"

    .line 560
    .line 561
    :goto_b
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string p1, " is required, instead set "

    .line 565
    .line 566
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 570
    .line 571
    .line 572
    move-result p1

    .line 573
    if-eqz p1, :cond_26

    .line 574
    .line 575
    if-eq p1, v4, :cond_25

    .line 576
    .line 577
    if-eq p1, v6, :cond_24

    .line 578
    .line 579
    if-eq p1, v7, :cond_23

    .line 580
    .line 581
    if-eq p1, v0, :cond_22

    .line 582
    .line 583
    invoke-static {}, Lb61;->c()V

    .line 584
    .line 585
    .line 586
    throw v1

    .line 587
    :cond_22
    const-string p1, "GroupableFeatures.UHD_RECORDING"

    .line 588
    .line 589
    goto :goto_c

    .line 590
    :cond_23
    const-string p1, "GroupableFeature.IMAGE_ULTRA_HDR"

    .line 591
    .line 592
    goto :goto_c

    .line 593
    :cond_24
    const-string p1, "GroupableFeature.PREVIEW_STABILIZATION"

    .line 594
    .line 595
    goto :goto_c

    .line 596
    :cond_25
    const-string p1, "GroupableFeature.FPS_60"

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_26
    const-string p1, "GroupableFeature.HDR_HLG10"

    .line 600
    .line 601
    :goto_c
    const-string p2, " as either a required or preferred feature."

    .line 602
    .line 603
    invoke-static {p0, p1, p2}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p0

    .line 607
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    throw v1

    .line 611
    :cond_27
    new-instance p0, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    const-string p1, " is not supported with feature group"

    .line 620
    .line 621
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 629
    .line 630
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw p1

    .line 638
    :cond_28
    :goto_d
    return-void

    .line 639
    :cond_29
    const-string p0, "requiredFeatures and preferredFeatures have duplicate values: "

    .line 640
    .line 641
    invoke-static {p1, p0}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    throw v1

    .line 645
    :cond_2a
    const-string p0, "Duplicate values in preferredFeatures("

    .line 646
    .line 647
    const/16 p2, 0x29

    .line 648
    .line 649
    invoke-static {p2, p1, p0}, Lu52;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw v1
.end method

.method public constructor <init>(Lmj0;)V
    .locals 5

    const/4 v0, 0x3

    iput-byte v0, p0, Lxy0;->X:B

    .line 661
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 662
    iget-object v0, p1, Lmj0;->Y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 663
    sget-object v0, Ltp1;->a:Lnf1;

    .line 664
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 665
    invoke-virtual {v0, v2}, Lnf1;->c1(I)Lu61;

    move-result-object v0

    .line 666
    instance-of v2, v0, Ls52;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ls52;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ls52;->d1()Ljava/util/concurrent/Executor;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v0, v2

    goto :goto_3

    :cond_2
    :goto_2
    new-instance v2, Lrp1;

    invoke-direct {v2, v0}, Lrp1;-><init>(Lu61;)V

    goto :goto_1

    .line 667
    :cond_3
    :goto_3
    iput-object v0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 668
    iget-object v2, p1, Lmj0;->Y:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_4

    .line 669
    invoke-static {v0}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    move-result-object v0

    goto :goto_4

    .line 670
    :cond_4
    sget-object v0, Ltp1;->a:Lnf1;

    .line 671
    :goto_4
    iput-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 672
    sget-object v0, Ltp1;->a:Lnf1;

    if-eqz v0, :cond_5

    move-object v1, v0

    :cond_5
    if-eqz v1, :cond_6

    .line 673
    invoke-virtual {v1}, Ls52;->d1()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    new-instance v1, Lrp1;

    invoke-direct {v1, v0}, Lrp1;-><init>(Lu61;)V

    .line 674
    :cond_7
    iput-object v1, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 675
    new-instance v0, Lf08;

    const/4 v1, 0x0

    .line 676
    invoke-direct {v0, v1}, Lf08;-><init>(B)V

    .line 677
    iput-object v0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 678
    new-instance v0, Lyr2;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lyr2;-><init>(B)V

    iput-object v0, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 679
    iget-object p1, p1, Lmj0;->Z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 680
    iput-object p1, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 681
    new-instance p1, Lra;

    const/16 v0, 0xe

    .line 682
    invoke-direct {p1, v0, v1}, Lra;-><init>(BZ)V

    .line 683
    iput-object p1, p0, Lxy0;->j0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv06;Lv06;Lv06;Lf63;Lv06;Lv06;Lv06;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, Lxy0;->X:B

    .line 653
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 654
    iput-object p1, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 655
    iput-object p2, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 656
    iput-object p3, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 657
    iput-object p4, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 658
    iput-object p5, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 659
    iput-object p6, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 660
    iput-object p7, p0, Lxy0;->j0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz20;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lxy0;->X:B

    .line 684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 685
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 686
    iput-object p1, p0, Lxy0;->Y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()Liz;
    .locals 10

    .line 1
    iget-object v0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/Size;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " resolution"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/util/Size;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " originalConfiguredResolution"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    iget-object v1, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lpx1;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, " dynamicRange"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    iget-object v1, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Integer;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, " sessionType"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    iget-object v1, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroid/util/Range;

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const-string v1, " expectedFrameRateRange"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_4
    iget-object v1, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Boolean;

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    const-string v1, " zslDisabled"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    new-instance v2, Liz;

    .line 79
    .line 80
    iget-object v0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v3, v0

    .line 83
    check-cast v3, Landroid/util/Size;

    .line 84
    .line 85
    iget-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v4, v0

    .line 88
    check-cast v4, Landroid/util/Size;

    .line 89
    .line 90
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v5, v0

    .line 93
    check-cast v5, Lpx1;

    .line 94
    .line 95
    iget-object v0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-object v0, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v7, v0

    .line 106
    check-cast v7, Landroid/util/Range;

    .line 107
    .line 108
    iget-object v0, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v8, v0

    .line 111
    check-cast v8, Ll11;

    .line 112
    .line 113
    iget-object p0, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    invoke-direct/range {v2 .. v9}, Liz;-><init>(Landroid/util/Size;Landroid/util/Size;Lpx1;ILandroid/util/Range;Ll11;Z)V

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_6
    const-string p0, "Missing required properties:"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x0

    .line 135
    return-object p0
.end method

.method public c()Lg50;
    .locals 5

    .line 1
    iget-object v0, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ll37;

    .line 10
    .line 11
    sget-object v1, Lxp4;->q0:Lxp4;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lvp4;->f(Lxp4;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lgl;

    .line 22
    .line 23
    iget-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ll37;

    .line 26
    .line 27
    sget-object v2, Lxp4;->r0:Lxp4;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lvp4;->f(Lxp4;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-static {v0, v1}, Lit0;->d(Ljava/lang/reflect/Member;Z)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    new-array v1, v1, [Lf50;

    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, [Lf50;

    .line 70
    .line 71
    iget-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ll37;

    .line 74
    .line 75
    sget-object v2, Lxp4;->q0:Lxp4;

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lvp4;->f(Lxp4;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    array-length v1, v0

    .line 84
    const/4 v2, 0x0

    .line 85
    :goto_0
    if-ge v2, v1, :cond_4

    .line 86
    .line 87
    aget-object v3, v0, v2

    .line 88
    .line 89
    iget-object v4, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ll37;

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lf50;->h(Ll37;)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    :goto_1
    iget-object v0, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lwg;

    .line 102
    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    return-object p0

    .line 107
    :cond_3
    sget-object v0, Lxy0;->l0:[Lf50;

    .line 108
    .line 109
    :cond_4
    iget-object v1, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, [Lf50;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    array-length v1, v1

    .line 116
    iget-object v2, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-ne v1, v2, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    iget-object v1, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object p0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, [Lf50;

    .line 144
    .line 145
    array-length p0, p0

    .line 146
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    const-string v1, "Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)"

    .line 155
    .line 156
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_6
    :goto_2
    new-instance v1, Lg50;

    .line 165
    .line 166
    iget-object v2, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, Lz20;

    .line 169
    .line 170
    iget-object v2, v2, Lz20;->a:Ldh8;

    .line 171
    .line 172
    iget-object v3, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, [Lf50;

    .line 175
    .line 176
    invoke-direct {v1, v2, p0, v0, v3}, Lh50;-><init>(Ldh8;Lxy0;[Lf50;[Lf50;)V

    .line 177
    .line 178
    .line 179
    return-object v1
.end method

.method public d(Ljava/util/HashMap;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcy0;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lw06;

    .line 32
    .line 33
    iget-boolean v1, v1, Lcy0;->d:Z

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v2, 0x2

    .line 40
    if-ne v1, v2, :cond_0

    .line 41
    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    :goto_1
    invoke-interface {v0}, Lw06;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p0, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lb42;

    .line 51
    .line 52
    monitor-enter p0

    .line 53
    :try_start_0
    iget-object p1, p0, Lb42;->b:Ljava/util/ArrayDeque;

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iput-object p2, p0, Lb42;->b:Ljava/util/ArrayDeque;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_4

    .line 63
    :cond_3
    move-object p1, p2

    .line 64
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p0}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :cond_5
    :goto_3
    return-void

    .line 84
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    throw p1
.end method

.method public g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcy0;

    .line 24
    .line 25
    iget-object v2, v1, Lcy0;->c:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lli1;

    .line 42
    .line 43
    iget-byte v4, v3, Lli1;->b:B

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v6, v3, Lli1;->a:Le26;

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    iget-object v4, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/util/HashMap;

    .line 63
    .line 64
    iget-object v3, v3, Lli1;->a:Le26;

    .line 65
    .line 66
    sget-object v5, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 67
    .line 68
    check-cast v5, Ljava/util/Set;

    .line 69
    .line 70
    new-instance v6, Lq74;

    .line 71
    .line 72
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    iput-object v7, v6, Lq74;->b:Ljava/util/Set;

    .line 77
    .line 78
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iput-object v7, v6, Lq74;->a:Ljava/util/Set;

    .line 88
    .line 89
    iget-object v7, v6, Lq74;->a:Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {v7, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    iget-object v4, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Ljava/util/HashMap;

    .line 101
    .line 102
    iget-object v6, v3, Lli1;->a:Le26;

    .line 103
    .line 104
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_1

    .line 109
    .line 110
    iget-byte v4, v3, Lli1;->b:B

    .line 111
    .line 112
    const/4 v6, 0x1

    .line 113
    if-eq v4, v6, :cond_4

    .line 114
    .line 115
    if-ne v4, v5, :cond_3

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    iget-object v4, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Ljava/util/HashMap;

    .line 121
    .line 122
    iget-object v3, v3, Lli1;->a:Le26;

    .line 123
    .line 124
    new-instance v5, Lnd5;

    .line 125
    .line 126
    sget-object v6, Lnd5;->c:Lxw3;

    .line 127
    .line 128
    sget-object v7, Lnd5;->d:Lvy0;

    .line 129
    .line 130
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object v6, v5, Lnd5;->a:Lxw3;

    .line 134
    .line 135
    iput-object v7, v5, Lnd5;->b:Lw06;

    .line 136
    .line 137
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_4
    new-instance p0, Lbw4;

    .line 142
    .line 143
    iget-object v0, v3, Lli1;->a:Le26;

    .line 144
    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v3, "Unsatisfied dependency for component "

    .line 148
    .line 149
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, ": "

    .line 156
    .line 157
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p0

    .line 171
    :cond_5
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv06;

    .line 4
    .line 5
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lv06;

    .line 15
    .line 16
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Lzu4;

    .line 22
    .line 23
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lv06;

    .line 26
    .line 27
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v4, v0

    .line 32
    check-cast v4, Lwr6;

    .line 33
    .line 34
    iget-object v0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lf63;

    .line 37
    .line 38
    invoke-virtual {v0}, Lf63;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v5, v0

    .line 43
    check-cast v5, Lf63;

    .line 44
    .line 45
    iget-object v0, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lv06;

    .line 48
    .line 49
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v6, v0

    .line 54
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    iget-object v0, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lv06;

    .line 59
    .line 60
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v7, v0

    .line 65
    check-cast v7, Lwr6;

    .line 66
    .line 67
    new-instance v8, Lf08;

    .line 68
    .line 69
    const/16 v0, 0xd

    .line 70
    .line 71
    invoke-direct {v8, v0}, Lf08;-><init>(B)V

    .line 72
    .line 73
    .line 74
    new-instance v9, Lf08;

    .line 75
    .line 76
    const/16 v0, 0x9

    .line 77
    .line 78
    invoke-direct {v9, v0}, Lf08;-><init>(B)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lxy0;->j0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Lv06;

    .line 84
    .line 85
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    move-object v10, p0

    .line 90
    check-cast v10, Lwr6;

    .line 91
    .line 92
    new-instance v1, Ljl1;

    .line 93
    .line 94
    invoke-direct/range {v1 .. v10}, Ljl1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v1
.end method

.method public h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcy0;

    .line 25
    .line 26
    iget-boolean v3, v2, Lcy0;->e:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v3, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lw06;

    .line 40
    .line 41
    iget-object v2, v2, Lcy0;->b:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Le26;

    .line 58
    .line 59
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lw06;

    .line 74
    .line 75
    check-cast v4, Lnd5;

    .line 76
    .line 77
    new-instance v5, Lsc;

    .line 78
    .line 79
    const/16 v6, 0xe

    .line 80
    .line 81
    invoke-direct {v5, v4, v3, v6}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    return-object v1
.end method

.method public declared-synchronized i(Le26;)Lw06;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lq74;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :cond_0
    :try_start_1
    sget-object p1, Lxy0;->k0:Lvy0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    throw p1
.end method

.method public declared-synchronized j(Le26;)Lw06;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "Null interface requested."

    .line 3
    .line 4
    invoke-static {p1, v0}, Ljb5;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lw06;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public l()Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object v0, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lcy0;

    .line 44
    .line 45
    iget-boolean v5, v4, Lcy0;->e:Z

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lw06;

    .line 55
    .line 56
    iget-object v4, v4, Lcy0;->b:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Le26;

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    new-instance v6, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/util/Set;

    .line 93
    .line 94
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/Map$Entry;

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Le26;

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ljava/util/Collection;

    .line 139
    .line 140
    check-cast v2, Ljava/util/Set;

    .line 141
    .line 142
    new-instance v4, Lq74;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    iput-object v5, v4, Lq74;->b:Ljava/util/Set;

    .line 149
    .line 150
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iput-object v5, v4, Lq74;->a:Ljava/util/Set;

    .line 160
    .line 161
    iget-object v5, v4, Lq74;->a:Ljava/util/Set;

    .line 162
    .line 163
    invoke-interface {v5, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Lq74;

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/util/Set;

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_4

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Lw06;

    .line 201
    .line 202
    new-instance v5, Lsc;

    .line 203
    .line 204
    const/16 v6, 0xf

    .line 205
    .line 206
    invoke-direct {v5, v3, v4, v6}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_6
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Lxy0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "SessionConfig@"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " {useCases="

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lxy0;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", frameRateRange="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lxy0;->Z:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Landroid/util/Range;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", requiredFeatureGroup="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lxy0;->f0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/Set;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", preferredFeatureGroup="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", effects="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Ljava/util/List;

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p0, ", viewPort=null}"

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
